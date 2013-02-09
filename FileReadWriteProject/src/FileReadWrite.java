import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileReadWrite {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.write("Welcome to file read write \n");
			pw.write("another line\n");
			pw.write("yer another line");
			
			pw.close();
			
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			String read = null;
			while((read= br.readLine())!= null){				
			
			System.out.println(read);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
