/**
 * 
 */
package orz.mike_neck.sample.annotation.processor.test;

import java.util.Date;
import java.util.List;

import orz.mike_neck.sample.annotation.processor.AutoBean;

/**
 * The test code for <code>AutoBean</code>.<br/>
 * This Class contains only fields.<br/>
 * Expecting a Class generated with accessor methods for this Class. 
 * @author mike
 *
 */
@AutoBean(beanName = "orz.mike_neck.sample.annotation.processor.test.AutoBeanTestGen")
public class AutoBeanTest {
	protected long id;
	protected String name;
	protected int age;
	protected Date birthDay;
	protected List<AutoBeanTest> friends;
}
