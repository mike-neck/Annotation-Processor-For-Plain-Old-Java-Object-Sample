/**
 * 
 */
package orz.mike_neck.sample.annotation.processor;

import java.io.IOException;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.TypeDeclaration;

/**
 * @author mike
 *
 */
public class AutoBeanAnnotationProcessor implements AnnotationProcessor {

	private final AnnotationProcessorEnvironment env;

	/**
	 * Constructor
	 * @param env
	 */
	public AutoBeanAnnotationProcessor(AnnotationProcessorEnvironment env) {
		this.env = env;
	}

	/**
	 * @see com.sun.mirror.apt.AnnotationProcessor#process()
	 */
	@Override
	public void process() {
		for(TypeDeclaration type : env.getSpecifiedTypeDeclarations())
			processType(type);
	}

	private void processType(TypeDeclaration type) {
		String className = type.getSimpleName();
		if(className.endsWith(AutoBeanConvention.CLASS_NAME_END_WITH))
			return;
		try {
			BeanVisitor.exec(type, env);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
