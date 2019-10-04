package kr.ac.hansung;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PetOwner {
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
