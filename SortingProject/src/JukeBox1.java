import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class JukeBox1 {

	/**
	 * @param args
	 */
	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String[] args) {
		new JukeBox1().go();

	}
	public void go(){
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	void getSongs(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("songs.txt"));
			String line = null;
			
				while ((line =br.readLine())!= null) {
					addSong(line);
							
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
	void addSong(String song){
		songList.add(song);
	}

}
