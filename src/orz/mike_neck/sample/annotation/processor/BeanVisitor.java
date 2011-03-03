/**
 * 
 */
package orz.mike_neck.sample.annotation.processor;

import java.io.IOException;

import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.util.SimpleDeclarationVisitor;

/**
 * Bean Creator. 
 * @author mike
 *
 */
public class BeanVisitor extends SimpleDeclarationVisitor {

	private static final String BEAN_TEMPLATE_HEADER 
		= "/**\n"
		+ " * Auto Generated Bean<br/>\n"
		+ " * This class is created automatically by AutoBeanAnnotationProcessor.<br/>\n"
		+ " * Inspired by <a href=\"http://blogs.dion.ne.jp/kotemaru/archives/9539738.html\">kotemaru</a>\n"
		+ " */"
		+ "package ${packageName};\n"
		+ "public class ${className}\n"
		+ "\textends ${resClassName} {\n";
	
	/**
	 * Create a Java Bean File. Adding setter/getter methods to the original class. 
	 * @param type
	 * @param env
	 * @throws IOException
	 */
	public static void exec(TypeDeclaration type,
			AnnotationProcessorEnvironment env) throws IOException {
		
	}

}
