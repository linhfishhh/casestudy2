package CaseStudy;
import java.util.*;
import java.io.*;
public class Album implements Serializable, Comparable<Album> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Scanner sc=new Scanner(System.in);
	private int IdAlbum;
	private String NameAlbum;
	private Date Date;
	private ArrayList<Song> list  = new ArrayList<Song>();
	/**
	 * @return the idAlbum
	 */
	
	public int getIdAlbum() {
		return IdAlbum;
	}
	/**
	 * @return the list
	 */
	public ArrayList<Song> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Song> list) {
		this.list = list;
	}
	/**
	 * @param idAlbum the idAlbum to set
	 */
	public void setIdAlbum(int idAlbum) {
		IdAlbum = idAlbum;
	}
	/**
	 * @return the nameAlbum
	 */
	public String getNameAlbum() {
		return NameAlbum;
	}
	/**
	 * @param nameAlbum the nameAlbum to set
	 */
	public void setNameAlbum(String nameAlbum) {
		NameAlbum = nameAlbum;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		Date = date;
	}
	Album(int idAlbum, String nameAlbum) {
		super();
		IdAlbum = idAlbum;
		NameAlbum = nameAlbum;
		Date=new Date();
	}
	Album() {
		super();
	}
	@Override
	public String toString() {
		return "Album [IdAlbum=" + IdAlbum + ", NameAlbum=" + NameAlbum + ", Date=" + Date + "]";
	}
//	public Song createSong() {
//		System.out.println("1. id song");
//		int id=Integer.parseInt(sc.nextLine());
//		System.out.println("2. name song");
//		String name=sc.nextLine();
//		System.out.println("3. Author song");
//		String Author=sc.nextLine();
//		return new Song(id,name,Author);
//	}
	@Override
	public int compareTo(Album o) {
		// TODO Auto-generated method stub
		return this.getNameAlbum().compareTo(o.getNameAlbum());
	}
	
}
