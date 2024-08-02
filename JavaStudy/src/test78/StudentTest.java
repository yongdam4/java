package test78;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Student[] sd = new Student[3];
		
		sd[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		sd[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		sd[2] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		
		for(int i = 0; i < sd.length; i++) {
			System.out.println(sd[i].toString());
			}
		System.out.println();
		
	}

}
