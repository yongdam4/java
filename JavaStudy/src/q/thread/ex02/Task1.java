package q.thread.ex02;

public class Task1 extends Thread{
	//미만 짝수출력 
	
	@Override
	public void run() {
		try {
		for(int i = 0; i < 20; i++){
			if(i%2 == 0) {
				System.out.println(i + " ");
			}
			
				Thread.sleep(200);//0.2초씩 정지
		}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	


