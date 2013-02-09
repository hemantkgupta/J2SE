import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class JukeBox4 {

	/**
	 * @param args
	 */
	ArrayList<Song> songList = new ArrayList<Song>();
	//Set<Song> songList = new TreeSet<Song>();
	public static void main(String[] args) {
		new JukeBox3().go();

	}
	public void go(){
		getSongs();
		// List will have unsorted elements 
		System.out.println(songList);
		// To sort elements 
		//Sorting will be done as per Comparable contract on Song
		Collections.sort(songList);
		System.out.println(songList);	
		//To get unsorted and without duplicate elements
		//Duplicate elements will be removed as per equals() and hashCode() contract on Song
		//Set<Song> songSet = new HashSet<Song>();
		// To get sorted and without duplicate elements
		Set<Song> songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
	void getSongs(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("fullsongs.txt"));
			String line = null;
			
				while ((line =br.readLine())!= null) {
					addSong(line);
							
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
	void addSong(String song){
		String[] tokens = song.split(",");
		Song nextSong = new Song(tokens[0],tokens[1],tokens[2]);
		songList.add(nextSong);
	}

}

