package diProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import diProject.ui.ExamConsole;


public class Program_DI {

	public static void main(String[] args) {
		
		//maven�� springframework ��ġ�ؾ���
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diProject/setting.xml");
		
		//id�� �ҷ����� ĳ������ ����� ��
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

		
		
		
		
		//ExamConsole console = new InlineExamConsole(exam); // DI �����ڸ� ����ϴ� ���
		
			//�Ϲ������� �ڵ� -> ���⼭ ���� �ʰ� xml���� ����
//		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole();	// DI setter�� ����ϴ� ���
//		exam.total();
//		console.setExam(exam);
//		console.print();
//		 
		
		
	}

}
