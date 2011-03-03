/**
 * 
 */
package orz.mike_neck.sample.annotation.processor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Add setter &amp; getter method to POJO without these methods.
 * @author mike_neck
 * @see http://goo.gl/LtjYD
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface AutoBean {
	boolean setter() default true;
	boolean getter() default true;
	String beanName();
}
