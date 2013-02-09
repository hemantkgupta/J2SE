
public class Song1 implements Comparable<Song>{
	
	//implements Comparable<Song>
	String title;
	String artist;
	String rating;
	Song1(String title, String artist, String rating){
		this.title= title;
		this.artist = artist;
		this.rating = rating;
	}
	
	public boolean equals(Object aSong){
		Song1 s = (Song1) aSong;
		return getTitle().equals(s.getTitle());
	}
	public int hashCode(){
		return title.hashCode();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int compareTo(Song s) {		
		return title.compareTo(s.getTitle());
	}
	public String toString(){
		return title;
	}
	
}

