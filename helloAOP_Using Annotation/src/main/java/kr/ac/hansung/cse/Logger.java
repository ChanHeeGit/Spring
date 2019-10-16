package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class Logger {
	
	@Pointcut("execution( void kr.ac.hansung.cse.*.sound() )") // 이 메소드를 실행할 때 -- 
	private void selectSound() { // Pointcut에 대한 id 지정을 메소드로 한다. signiture라고 함.
		
	}
	
	@Before("selectSound()") // advice// Pointcut의 id를 지정해준다.
	public void aboutToSound() {
		System.out.println("advice : about to sound");
	}

}
