import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


public class JukeBox2 {

	/**
	 * @param args
	 */
	Set<String> songList = new TreeSet<String>();
	public static void main(String[] args) {
		new JukeBox2().go();

	}
	public void go(){
		getSongs();
		//System.out.println(songList);
		//Collections.sort(songList);
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

