package practicefile;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder s) {
		s.toString();
		fd.fileSave(file, s.toString());
		return;
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder s) {
		fd.fileEdit(file, s.toString());
	}
	
	
	

}
