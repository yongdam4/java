package eat;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filebyte {

	public void FileSave(String fileName) {
		
			try(FileWriter fw = new FileWriter("byte_test.txt", true);) {
				
				fw.write(fileName);
				fw.write(20);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
