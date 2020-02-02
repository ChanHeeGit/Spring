package diProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import diProject.ui.ExamConsole;


public class Program_DI {

	public static void main(String[] args) {
		
		//maven에 springframework 설치해야함
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diProject/setting.xml");
		
		//id로 불러오면 캐스팅을 해줘야 함
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

		
		
		
		
		//ExamConsole console = new InlineExamConsole(exam); // DI 생성자를 사용하는 방법
		
			//일반적으로 코딩 -> 여기서 하지 않고 xml에서 설정
//		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole();	// DI setter를 사용하는 방법
//		exam.total();
//		console.setExam(exam);
//		console.print();
//		 
		
		
	}

}
