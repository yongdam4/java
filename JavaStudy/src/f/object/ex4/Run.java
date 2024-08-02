package f.object.ex4;

public class Run {
public static void main(String[] args) {
	
	Book he = new Book();
	Book ban = new Book();
	
	he.name = "해리포터";
	he.series = 7;
	
	ban.name = "반지의제왕";
	ban.series = 6;
	
	he.print();
	ban.print();
}
}
