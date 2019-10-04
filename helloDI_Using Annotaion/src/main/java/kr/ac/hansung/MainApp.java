package kr.ac.hansung;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//스프링 컨테이너 생성시 해당 설정 xml파일을 인자로 넣어준다
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/hansung/conf/animal.xml");
		
		//id_petOwner라는 빈을 가져온다.
		PetOwner person = (PetOwner) context.getBean("id_petOwner");
		person.play(); // 해당 빈의 메소드 호출
		
		context.close();
	}

}
