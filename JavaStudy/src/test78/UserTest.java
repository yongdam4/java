package test78;

public class UserTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User[] us = new User[3];
		
		us[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		us[1] = new User("user02" ,"pass02" ,"이영희" ,25 ,'F' ,"010-5555-7777");
		us[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		
		System.out.println("users list------------------------------------");
		for(int i = 0; i < us.length; i++) {
			System.out.println(us[i].toString());
		}
		
		
		User[] copyUsers = new User[us.length];
		System.out.println("copyUsers------------------------------------");
		for(int i = 0; i < copyUsers.length; i++) {
			copyUsers[i] = (User)us[i].clone();
			
		}
		
		
		
//		for(int i = 0; i < copyUsers.length; i++) {
//			User copy = copyUsers[i]
//		}
		
		for(User copy : copyUsers ) {
			System.out.println(copy.toString());
		}
		System.out.println("비교 결과------------------------------------");
		for(int i = 0; i < copyUsers.length; i++) {
			System.out.println(copyUsers[i].equals(us[i]));
		}
		//객체비교는 항상 equals 사용
		
		
	}

}
