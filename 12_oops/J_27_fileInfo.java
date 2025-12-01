import java.io.File;

public class J_27_fileInfo{
	public static void main(String args[]){
		File f = new File("C:\\Users\\rikus\\Desktop\\java folder\\13\\n_file_created.txt");
		if(f.exists()){
			System.out.println("File name : "+f.getName());
			System.out.println("File location : "+f.getAbsolutePath());
			System.out.println("File writeable : "+f.canWrite());
			System.out.println("File readable : "+f.canRead());
			System.out.println("File size : "+f.length());
			
			}
	}
}