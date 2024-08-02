package q.threadchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main() {
		int port = 3000;
		
		try {
			ServerSocket soc = new ServerSocket(port);
			System.out.println("서버 연결준비 완료 ......");
			
			Socket socket = soc.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			//클라이언트로 부터 메세지를 받는 쓰레드
			ServerReceive receive = new ServerReceive(socket);
			Thread receiveTask = new Thread(receive);
			receiveTask.start();
			//클라이언트로 부터 메세지를 보내는 쓰레드
			ServerSend send = new ServerSend(socket);
			Thread sendTask = new Thread(send);
			sendTask.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
