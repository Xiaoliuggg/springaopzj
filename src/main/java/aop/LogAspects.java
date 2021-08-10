package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LogAspects {
	@Pointcut("execution(* service.StudentService.*(..))")
	public void pointCut(){}	
	@Before("pointCut()")
	public void logStart(JoinPoint jp){
		Object[] args = jp.getArgs();
		System.out.println(jp.getSignature().getName()+"方法开始运行，参数列表为：{"+Arrays.asList(args)+" }");
	}
	@AfterReturning(value="pointCut()",returning = "result")
	public void logReturn(JoinPoint jp,double result)
	{
		System.out.println(jp.getSignature().getName()+"方法正常运行，返回结果为：{"+result+" }");
	}	
	@AfterThrowing(value="pointCut()",throwing = "ex")
	public void logException(JoinPoint jp,Exception ex)
	{
		System.out.println(jp.getSignature().getName()+"方法出现异常，异常信息为：{"+ex+" }");

	}	
	@After("pointCut()")
	public void logEnd(JoinPoint jp)
	{
		System.out.println(jp.getSignature().getName()+"方法结束运行。。。");	

	}	

}
