package test.test240709;

public class Bookrun {
public static void main(String[] args) {
	
	Book b1 = new Book();
	Book b2 = new Book("홍길동전", "길벗", "허균");
	Book b3 = new Book("자바란 무엇인가?", "kh","최지원", 20000, 30);
	
	b1.inform();
	System.out.println();
	b2.inform();
	System.out.println();
	b3.inform();
	System.out.println();
	
}
}
