package aoptest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import method.MainConfig;
import entities.Student;
import service.StudentService;

public class aoptest {
	@Test
	public void testAop()
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		StudentService bean=applicationContext.getBean(StudentService.class);
		Student stu = bean.selectStuById("2018");
		System.out.println(stu.toString());
		applicationContext.close();
		}
	

	
}
