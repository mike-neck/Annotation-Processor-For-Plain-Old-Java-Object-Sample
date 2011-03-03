/**
 * 
 */
package orz.mike_neck.sample.annotation.processor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.apt.AnnotationProcessors;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

/**
 * @author mike
 *
 */
public class AutoBeanAnnotationProcessorFactory implements
		AnnotationProcessorFactory {

	/**
	 * package name
	 */
	private static final String PKG_NAME = "orz.mike_neck.sample.annotation.processor.";

	/**
	 * Bean Name to be created by this factory
	 */
	private static final String BEAN_NAME = PKG_NAME + "AutoBean";

	/**
	 * Supported Annotation Types
	 * @see AutoBeanAnnotationProcessorFactory#BEAN_NAME
	 */
	private Collection<String> supportedAnnotationTypes = Arrays.asList(BEAN_NAME);

	/**
	 * Supported Options (empty)
	 */
	private Collection<String> supportedOptions = Collections.emptySet();

	/**
	 * @see com.sun.mirror.apt.AnnotationProcessorFactory#getProcessorFor(java.util.Set, com.sun.mirror.apt.AnnotationProcessorEnvironment)
	 */
	@Override
	public AnnotationProcessor getProcessorFor(
			Set<AnnotationTypeDeclaration> annotationType,
			AnnotationProcessorEnvironment env) {
		if(annotationType.contains(env.getTypeDeclaration(BEAN_NAME))){
			return new AutoBeanAnnotationProcessor(env);
		}else{
			return AnnotationProcessors.NO_OP;
		}
	}

	/**
	 * @see com.sun.mirror.apt.AnnotationProcessorFactory#supportedAnnotationTypes()
	 */
	@Override
	public Collection<String> supportedAnnotationTypes() {
		return this.supportedAnnotationTypes;
	}

	/**
	 * @see com.sun.mirror.apt.AnnotationProcessorFactory#supportedOptions()
	 */
	@Override
	public Collection<String> supportedOptions() {
		return this.supportedOptions;
	}

}
