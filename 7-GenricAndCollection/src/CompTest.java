import java.util.*;
import java.io.*;
public class CompTest{
	ArrayList<DVDInfo> l=new ArrayList<DVDInfo>();
	public static void main(String [] args){
		new CompTest().go();
	}	
	public void go(){
		populateList();
		Collections.sort(l);
		System.out.println("list contains :"+l);
	//	Collections.reverse(l);
	//	System.out.println("list contains :"+l);
		Comparator ro=Collections.reverseOrder();
		Collections.sort(l,ro);
		System.out.println("list contains :"+l);
		GenereSort gs=new GenereSort();
		Collections.sort(l,gs);
		System.out.println("list contains :"+l);
					
	}
	public void populateList(){
		try{
			File file=new File("data.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null){  
				String[] tokens = s.split(",");
				DVDInfo a=new DVDInfo(tokens[0],tokens[1],tokens[2]);
				l.add(a);
			}
		}catch(IOException e){	}
		
	}
		
}

	

 class DVDInfo implements Comparable<DVDInfo>{
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
	   public int compareTo(DVDInfo d){
	   		return title.compareTo(d.getTitle());
	   }
	   public String getTitle(){
	   	return title;
	   }	
       public String getGenere(){
       	return genere;
       }
}

class GenereSort implements Comparator<DVDInfo>{
	public int compare(DVDInfo one ,DVDInfo two){
		return one.getGenere().compareTo(two.getGenere());
	}
}
	
