package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	//기본생성자
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	public InlineExamConsole(Exam exam) {
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
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
		
	}

}
