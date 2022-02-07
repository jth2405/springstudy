package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

//����ó�� �� ����Ǵ� �κ�
public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("���ܰ� �߻��Ͽ����ϴ�.: "+ e.getMessage());
	}
	
}
