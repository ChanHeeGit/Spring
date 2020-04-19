package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

//<context:component-scan base-package="spring.di.ui, spring.di.entity">
@ComponentScan("spring.di.ui")
//xml 설정을 java에서 할 수 있게 해주는 annotation
@Configuration
public class NewlecDIConfig {
	
	//객체를 생성하여 IOC 컨테이너에 담아준다.
	@Bean
	public Exam exam(){
		return new NewlecExam();
	}
}
