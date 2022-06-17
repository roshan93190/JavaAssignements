package masai.vom.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.LinkedHashSet;




public class PlayList {
	@Override
	public int hashCode() {
		return Objects.hash(songs);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return Objects.equals(songs, other.songs);
	}


	List<Song> songs = new ArrayList<>();
                
	

	public void addSong(Song song) {
		songs.add(song);
		
		int listsize=songs.size();
		LinkedHashSet<Song> Ulist=new LinkedHashSet<>(songs);
		int UlistS=Ulist.size();
		if(listsize==UlistS) {
		System.out.println("Song added to the playlist successfully.");
		}
		else {
			System.out.println("Song is already added in the playlist");
		}
		songs.removeAll(songs);
		for (Song U:Ulist) {
			songs.add(U);
		}
	}
	public static void main(String[] args) {
		
	}
	}

 
