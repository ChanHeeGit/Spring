package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	@Autowired // AnimalType을 가진 bean을 주입시켜준다.
	@Qualifier(value="qf_dog")
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
