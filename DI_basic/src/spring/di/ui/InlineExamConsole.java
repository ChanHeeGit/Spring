package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class InlineExamConsole implements ExamConsole {

	
	//이부분에 Autowired를 정의하면 생성자가 실행될 때 di된다
	//밑에 setter부분에 정의하면 setter함수 실행시 di됌
	//@Autowired(required = false) // bean 객체가 없어도 null처리하고 진행!
	
	@Autowired(required = false) // bean 객체가 없어도 null처리하고 진행!
	private Exam exam;
	
	//기본생성자
	public InlineExamConsole() {
		System.out.println("기본생성자 !");
	}
	
	//오버로드 생성자
	//여기에서 Qualifier로 di를 하려면 밖에 선언해서는 안됌
	//->파라미터가 몇개가 들어갈지 몰라서 오류 발생
	//public InlineExamConsole(@Qualifier("exam1")Exam exam1,
	//                         @Qualifier("exam2")Exam exam2)
	// 이런식으로 안에다 직접 하나씩 선언해 줘야 di가 정상적으로 된다.
	
	public InlineExamConsole(Exam exam) {
		System.out.println("오버로드 생성자 !");
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}
	
	//Autowired는 '지료형(형식)'을 판단하여 DI를 실행한다. (Exam)
	// Exam 타입의 exam객체명이 아니라도 .. ex) Exam plpl; 이런식으로 해도 작동함
	
	//@Qualifier : '객체이름'을 판별하여 DI한다
	//한 클래스에서 생성되는 bean이 여러개고 자료형이 같을 때, @Qualifier("객체명"); 을 통하여
	//xml에서 정의한 id와 일차하는 bean을 DI해준다. 객체명->exam객체에 대입되어 setter가 실행됌
	//@Autowired
	@Override
	public void setExam(Exam exam) {
		System.out.println("세터 !");
		this.exam=exam;
		
	}

}
