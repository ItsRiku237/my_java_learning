import java.io.File;
import java.io.IOException;

public class J_26_create_file{
	public static void main(String args[]){
		File f = new File("C:\\Users\\rikus\\Desktop\\java folder\\13\\n_file_created.txt");
		try{
			if(f.createNewFile())
				System.out.println("File sucessfully created.");
			else
				System.out.println("File already created.");
		}
		catch(IOException i){
			System.out.println("Exception Handling");
		}
	}
}