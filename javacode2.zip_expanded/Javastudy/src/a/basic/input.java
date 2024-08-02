package a.basic;
import java.util.Scanner;
//1) Scanner를 사용하기 위해서 외부로부터 가져온다.

public class input {
	/*
	 * 키보드로 값을 입력하는 방법
	 * Scanner를 사용한다
	 * (java.util.Scanner 클래스를 이용한다)
	 * 
	 * [사용법]
	 * Scanner 이름 = new Scanner(System.in);
	 * ex) Scanner sc = new Scanner(System.in);
	 * 
	 * sc.next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 가져온다
	 * sc.nextLine() ; 사용자가 입력한 값 중 \n(개행문자)를 포함하는 한 라인을 읽지만 \n을 버린 나머지 값만 가져온다
	 * 
	 * 
	 * sc.nextByte(),  sc.Short(),  sc.nextInt(), sc.nextLong()
	 * sc.nextFloat(), sc.nextDouble()
	 * 위처럼 정수나 실수를 입력받는 코드를 작성했을때 \n토큰이 함께들어오기 때문에
	 * sc.nextLine()을 통해서 비워주는 코드를 작성해야한다	
	 *  
	 *  sc.close() //더이상 Scanner를 사용하지않겠다
	 */
		public static void main(String[] args ) {
			Scanner sc = new Scanner(System.in);
			
//			String str1, str2;
//			str1 = sc.next();
//			sc.nextLine(); //버퍼에서 \n(엔터값)을 비워주는 코드를 실행한다

//			str2 = sc.nextLine();
			
//			System.out.println("str1 입력한 값 : " + str1);
//			System.out.println("str2 입력한 값 : " + str2);
			/*
			System.out.println("=================================================");
			String name, address;
			int age;
			float height;
			
			System.out.println("이름을 입력해주세요 : ");
			name = sc.next();
			sc.nextLine();
			
			System.out.println("나이를 입력해주세요 : ");
			age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("키를 입력해주세요 : ");
			height = sc.nextFloat();
			sc.nextLine();
			
			System.out.println("이름 :" + name );
			System.out.println("나이 :" + age );
			System.out.println("키 :" + height );
			System.out.println("==================================================");
			*/
			sc.close();
		
			
		}

}
