package org.springframework.edw.context;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.edw.domain.Student;
import static org.junit.Assert.*;

/**
 * @author Edwin Xu
 * @date 4/24/2021 11:24 PM.
 */

public class Context001Test {

	private static final String PREFIX_PATH = "org/springframework/edw/";

	@Test
	public void test001(){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(PREFIX_PATH+"context/context-test-001.xml");

		Student stu001 = (Student) context.getBean("stu001");
		System.out.println(stu001.toString());
		assertEquals(stu001.getName(),"edwin xu");
	}
}
