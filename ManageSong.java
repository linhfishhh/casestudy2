package CaseStudy;
import java.util.*;
import java.io.*;
public class ManageSong {
	static Scanner sc=new Scanner(System.in);
	public Song createSong() {
		System.out.println("1. id song");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("2. name song");
		String name=sc.nextLine();
		System.out.println("3. Author song");
		String Author=sc.nextLine();
		return new Song(id,name,Author);
	}
	public void addSong(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List = ManagerAlbum.ReadFile();
		for (int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				ArrayList<Song> ListSong=List.get(i).getList();
				ListSong.add(createSong());
			}
		}
		ManagerAlbum.WriteFile(List);
	}
	public void showSong(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List = ManagerAlbum.ReadFile();
		sort(name);
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				ArrayList<Song> ListSong=List.get(i).getList();
				for(int j=0;j<ListSong.size();j++) {
					System.out.println(ListSong.get(j));
				}
			}
		}
	
	}
	public void EditSong(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List = ManagerAlbum.ReadFile();
		for (int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				ArrayList<Song> ListSong=List.get(i).getList();
				System.out.println("Name Song Edit:");
				String name1=sc.nextLine();
				for(int j=0;j<ListSong.size();j++) {
					if(ListSong.get(j).getNameSong().equals(name1)) {
						ListSong.set(j, createSong());
					}
				}
			}
		}
		ManagerAlbum.WriteFile(List);
	}
	public void removeSong(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List = ManagerAlbum.ReadFile();
		for (int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				ArrayList<Song> ListSong=List.get(i).getList();
				System.out.println("Name Song remove:");
				String name1=sc.nextLine();
				for(int j=0;j<ListSong.size();j++) {
					if(ListSong.get(j).getNameSong().equals(name1)) {
						System.out.println("Da xoa "+ListSong.get(i));
						ListSong.remove(j);
					}
				}
			}
		}
		ManagerAlbum.WriteFile(List);
	}
	public void sort(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List=ManagerAlbum.ReadFile();
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				Collections.sort(List.get(i).getList());
			}
		}
		ManagerAlbum.WriteFile(List);
	}
}
