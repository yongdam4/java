package networkzz;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Clientnet {

	public void fileSave() {
		//FileWriter : 파일을 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 기반스트림
		//BufferedWriter : 속도향상에 도움을 주는 보조스트림
		FileWriter fw;
		
		try {
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(65);
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}

