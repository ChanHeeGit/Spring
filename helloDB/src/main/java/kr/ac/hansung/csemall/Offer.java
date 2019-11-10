package kr.ac.hansung.csemall;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor // 인자없는 생성자 자동 생성

public class Offer {
	//데이터베이스 모델
	
//	@Override -> 이게 ToString
//	public String toString() {
//		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
//	}
	
	private int id;
	private String name;
	private String email;
	private String text;
	
}
