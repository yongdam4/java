package q.thread.ex02;

public class Task2 extends Thread{

	@Override
	public void run() {
		try {
			for(int i = 0; i < 20; i++){
				if(i%2 == 1) {
					System.out.println(i + " ");
				}
				
					Thread.sleep(200);
			}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
			
