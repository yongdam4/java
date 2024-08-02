package test.person;
import java.util.Scanner;

public class PersonMenu {
		Scanner sc = new Scanner(System.in);
		PersonController pc = new PersonController();
		public void mainMenu() {
			while(true) {
				
				int[] countArr = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 "+ countArr[0] +"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은"+ countArr[1] +"명입니다.\n");
			
			
					System.out.println("1. 학생 메뉴 ");
					System.out.println("2. 사원 메뉴 ");
					System.out.println("9. 끝내기 ");
					System.out.println("메뉴 번호 : ");
					int num = sc.nextInt();
					
					switch(num) {
					case 1:
						this.studentMenu();
						break;
					case 2:
						this.employeeMenu();
						break;
					case 9:
						System.out.println("종료합니다.");
						return;
					default :
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
					
					}
			}
		}
	
		public void studentMenu() {
			while(true) {
				System.out.println();
				System.out.println("1. 학생 추가 ");
				System.out.println("2. 학생 보기 ");
				System.out.println("9. 메인으로 ");
				System.out.println("메뉴 번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
					case 1:
						this.insertStudent();
						break;
					case 2:
						 this.printStudent();
						break;
					case 9:
						System.out.println("메인으로 돌아갑니다.");
						return;
					default :
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						this.mainMenu();
					break;
				}
				
			}
		}
	
		public void employeeMenu() {
			while(true) {
				System.out.println("1. 사원 추가 ");
				System.out.println("2. 사원 보기 ");
				System.out.println("9. 메인으로 ");
				System.out.println("메뉴 번호 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1:
					insertStudent();
					break;
				case 2:
					 printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					this.mainMenu();
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					this.mainMenu();
				break;
				
				}
				}
		}
	
		public void insertStudent() {
			while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("학생 전공 : ");
			String major = sc.next();
			
			int[] personCount = pc.personCount();
			if(personCount[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생추가를 종료하고 학생 메뉴로 돌아갑니다.");
			return;
			}
			
			pc.insertStudent(name, age, height, weight, grade, major);
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char ch = sc.next().charAt(0);
			if(ch =='n' || ch== 'N') {
				return;
			}
			}
		}
	
		public void printStudent() {
			Student[] sArr = pc.printStudent();
			for(Student s : sArr) {
				if(s == null) {
					break;
				}
				System.out.println(s.toString());
			}
			
			
		}
	
		public void insertEmployee() {
			System.out.println("사원 이름 : ");
			String name = sc.next();
			
			System.out.println("사원 나이 : ");
			int age = sc.nextInt();
			
			System.out.println("사원 키 : ");
			double height = sc.nextInt();
			
			System.out.println("사원 몸무게 : ");
			double weight = sc.nextInt();
			
			System.out.println("사원 학년 : ");
			int grade = sc.nextInt();
			
			System.out.println("사원 전공 : ");
			String major = sc.next();
			
			pc.insertEmployee(name, age, height, weight, grade, major);
		}
		
		public void printEmployee() {
			pc.printEmployee();
		}
		
		
		
		
}
