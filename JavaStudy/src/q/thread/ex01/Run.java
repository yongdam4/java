package q.thread.ex01;

public class Run {

	/*
	 * 쓰레드 : 프로그램 내에서 실행의 흐름을 가지고있는 최소단위
	 * main 메소드 실행시 메인 쓰레드가 실형되는것이다
	 */
	public static void main(String[] args) {// 쓰레드를 상속받아 run을 구현한 객체를 생성한다
		
		Test t1 = new Test();
		Runnable task = new MyRunable();//run을 구현한 객체를 생성해서
		Thread t2 = new Thread(task);//thread 객체의 생성자에 넘겨준다
		
		
		t1.start();
		t2.start();
		
		System.out.println("END : " + Thread.currentThread().getName());
		
		
		
		
		
		
		
		
	}

	
	
	
	
}
