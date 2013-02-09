import java.util.*;
import java.io.*;
public class ComparableTest{
	public static void main(String [] args){
		ArrayList<DVDInfo> l=new ArrayList<DVDInfo>();
		try{
			File file=new File("data.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null){  
				String[] tokens = s.split("\\");
				DVDInfo a=new DVDInfo(tokens[0],tokens[1],tokens[2]);
				l.add(a);
			}
		}catch(IOException e){	}
		System.out.println("list contains :"=l);			
	}
}
	

 class DVDInfo {
	   String title;
	   String genere;
	   String leadActor;
	   
	   DVDInfo(String t, String g, String l){
	   	title=t;
	   	genere=g;
	   	leadActor=l;
	   }
	   public String toString(){
	   	return title + " " + genere+ " "+ leadActor + "\n";
	   }
	   	
       
}
