package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
			
		/*
		//Exam은 inteface
		//Exam exam = new NewlecExam(); // 생성
		ExamConsole console = new GridExamConsole(); 
		console.setExam(exam); // 조립 
		console.print(); // 출력
		*/
		
		// Ioc 컨테이너 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		
		// bean id로 가져오는 방법 : object 형식으로 가져오기 때문에 해당 type으로 형변환이 필요
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		// bean class로 가져오는 방법 : 많이쓰임
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e.toString());
		
		
	}

}
