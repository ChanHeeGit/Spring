package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
				// java config 사용
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				// xml config 사용
				//new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		
		// @Component로 생성하는 경우 이름을 지정하지 않기 때문에 id로 가져오려면
		// @Component("console")과 같이  찾을 id를 명시해줘야한다
		// bean id로 가져오는 방법 : object 형식으로 가져오기 때문에 해당 type으로 형변환이 필요
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		// bean class로 가져오는 방법 : 많이쓰임(형식으로 찾는법)
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e.toString());
		
		
	}

}
