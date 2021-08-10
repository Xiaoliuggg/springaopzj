package method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aop.LogAspects;
import entities.Student;
import service.StudentService;

@EnableAspectJAutoProxy

@Configuration 
public class MainConfig {
	@Bean
	public StudentService stuservice()
	{
		return new StudentService();
	}
	@Bean
	public LogAspects aspects()
	{
		return new LogAspects();
	}
}