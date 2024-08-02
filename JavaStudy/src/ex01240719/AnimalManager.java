package ex01240719;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] am = new Animal[5];
		am[0] = new Dog("흰둥이", "시고르자브종", 20);
		am[1] = new Cat("럭키", "먼치킨", "우리집", "흰색");
		am[2] = new Dog("멍구", "풍산개", 20);
		am[3] = new Dog("개똥이", "진독개", 20);
		am[4] = new Cat("유미", "잡종", "유원빌", "흰색");
		
		for(Animal ani : am) {
			ani.speak();
		}
		
		
		
		
		
		
	}

}
