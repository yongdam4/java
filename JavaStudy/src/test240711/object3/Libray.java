package test240711.object3;
import java.util.Scanner;

public class Libray {
	private Scanner sc = new Scanner(System.in);
	Book[] bArr = new Book[10];
	public void menu() {
		int menu =0;
		while(menu != 9) {
			System.out.println("===============도서관리 프로그램==============");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
	switch(menu) {
	case 1://도서등록
		this.addBook();
		break;
	case 2://도서목록 출력
		this.printBookList();
		break;
	case 3://도서 검색
		this.searchBook();
		break;
	case 4://도서 삭제
		this.printBookList();
		this.deleteBook();
		break;
	case 9://종료
		System.out.println("프로그램을 종료합니다");
		break;
		default://이외 입력시
			System.out.println("잘못 입력하셨습니다");
	}}}
	
	public void addBook() {
		 for(int i = 0; i < bArr.length; i++) {
			 if(bArr[i] == null) {
				// bArr[i] = new Book(name, jang, jur, bn);
				 System.out.println("책을 등록하였습니다.");
					System.out.println(bArr[i].toString());
				 break;
			 }else if(i == (bArr.length - 1)) { //마지막 인덱스까지 전부 확인한후
				 System.out.println("이미 등록할 수 있는 책이 가득찼습니다.");
			 }
		 }
	}
	
	
	
	
	public void printBookList() {
		System.out.println("==========등록 도서목록================");
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			System.out.println(bArr[i].toString());
		}
	}
	
	
	public void searchBook() {
		System.out.println("===============도서 검색===============");
		System.out.println("검색할 책 이름을 입력 : ");
		String target = sc.nextLine();
		//제목 : 아프니까 청춘이다 장르 : 에세이 저자 : 김용담 책번호 : 142
		//or 입력하신 제목의 책은 등록되어있지 않습니다.
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[0] != null) {//null을 발견하면 뒤에 데이터는 null이므로 반복 종료
				break;
			}else if( bArr[0] != null && target.equals(bArr[0].getName())) {//동일한 제목 발견시 출력후 반복 종료
		System.out.println(bArr.toString());
		break;
	}
		}
	}
			
			public void deleteBook() {
				System.out.println("삭제할 도서의 번호 입력 : ");
				int num = sc.nextInt();
				
				//배열에서 해당 책 삭제
				
				//배열에서 2번인 Book객체 찾기
				for(int i = 0; i < bArr.length; i++) {
					if(bArr[i] == null) {
						System.out.println("삭제할 도서의 번호를 찾지못하였습니다.");
						break;
					}else if(num == bArr[i].getBn()) {
						System.out.println("삭제 데이터 : " + bArr[i].toString());
						
						//삭제할 위치부터 마지막까지 모든 값을 한칸씩 앞으로 당김
						for(int j = i; j < (bArr.length - 1); j++) {
							bArr[j] = bArr[j+1];
						}
						//마지막 값에 null대입
						bArr[bArr.length -1] = null;
					}
				}
			}

			

}

