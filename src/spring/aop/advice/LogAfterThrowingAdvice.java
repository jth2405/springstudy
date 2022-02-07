package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

//예외처리 시 실행되는 부분
public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다.: "+ e.getMessage());
	}
	
}
