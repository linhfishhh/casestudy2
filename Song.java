package CaseStudy;

import java.io.Serializable;
public class Song implements Serializable, Comparable<Song> {
	private int IdSong;
	private String NameSong;
	private String Author;
	/**
	 * @return the id
	 */
	public int getId() {
		return IdSong;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		IdSong = id;
	}
	/**
	 * @return the nameSong
	 */
	public String getNameSong() {
		return NameSong;
	}
	/**
	 * @param nameSong the nameSong to set
	 */
	public void setNameSong(String nameSong) {
		NameSong = nameSong;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}
	Song(int id, String nameSong, String author) {
		super();
		IdSong = id;
		NameSong = nameSong;
		Author = author;
	}
	Song() {
		super();
	}
	@Override
	public String toString() {
		return "Song [Id=" + IdSong + ", NameSong=" + NameSong + ", Author=" + Author + "]";
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return this.getNameSong().compareTo(o.getNameSong());
	}
	
	
}
