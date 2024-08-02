package q.thread.ex01;

public class Test extends Thread{

	//쓰레드를 생성하는 방법 1
	//Thread 를 상속받는 클래스를 작성한다
	
	//메인문처럼 독립적으로 실행될 수 있는 메소드
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 30;

		//currentThread() : 지금 실행하고 있는  쓰레드의 정보객체를 반환한다
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}

	

}
