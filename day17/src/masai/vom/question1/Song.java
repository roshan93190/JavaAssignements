package masai.vom.question1;
import java.util.Objects;
import java.util.Scanner;
public class Song {

	private String movieName;
	private String songName;
	
      public Song(){
    	
    }
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public Song(String movieName,String songName) {
		this.movieName=movieName;
		this.songName=songName;
	}
	public void play() {
		
		
		System.out.println(getSongName()+" of "+getMovieName()+" is playing...!");
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a movie name of your choice");
			String movieName=sc.nextLine();
//			sc.nextLine();
			System.out.println("Enter the songName also of that particularMovie");
			String songName=sc.nextLine();
			Song song=new Song(movieName,songName);
			song.play();
	}
	
}
