package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 생성자 자동 생성 어노테이션
public class Customer {
	
	private String id;
	private String pw;
	
	
}

