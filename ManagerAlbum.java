package CaseStudy;
import java.util.*;
import java.io.*;
public class ManagerAlbum {
	static Scanner sc=new Scanner(System.in);
	public ManagerAlbum() throws FileNotFoundException, IOException, ClassNotFoundException {
		try{
			WriteFile(ReadFile());
		}catch(IOException e) {
			WriteFile(new ArrayList<Album>());
		}
	}
	private ArrayList<Album> List=new ArrayList<Album>();
	public static ArrayList<Album> ReadFile() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CaseStudy\\src\\CaseStudy\\File\\album.txt"));
		ArrayList<Album> List=(ArrayList<Album>) ois.readObject();
		ois.close();
		return List;
	}
	public static void WriteFile(ArrayList<Album> List) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\CaseStudy\\src\\CaseStudy\\File\\album.txt"));
		oos.writeObject(List);
		oos.close();
	}
	public Album createAlbum() throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		System.out.println("1.Id Album");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("2.Name Album");
		String name=sc.nextLine();
		int a=0;
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				a++;
				name=List.get(i).getNameAlbum()+"("+a+")";
			}
		}
		return new Album(id,name);
	}
	public void addAlbum() throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		Album A=createAlbum();
		List.add(A);
//		if(List==null) {
//			List.add(A);
//		}else {
//			for(int i=0;i<List.size();i++) {
//				if(List.get(i).getNameAlbum().equals(A.getNameAlbum())) {
//					a++;
//					A.setNameAlbum(List.get(i).getNameAlbum()+"("+a+")");
//				}
//			}
//		}
		WriteFile(List);
	}
	
	public void EditAlbum(String Name) throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		int a=0;
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(Name)) {
				System.out.println("Set Id Album:");
				int id=Integer.parseInt(sc.nextLine());
				List.get(i).setIdAlbum(id);
				System.out.println("Set Name Album");
				String name=sc.nextLine();
				List.get(i).setNameAlbum(name);
				a++;
				break;
			}
		}
		if(a==0) {
			System.out.println("khong tim thay ten album muon edit");
		}
		WriteFile(List);
	}
	public void removeAlbum(String Name) throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		int a=0;
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(Name)) {
				System.out.println("Da xoa "+List.get(i));
				List.remove(i);
				a++;
				break;
			}
		}
		if(a==0) {
			System.out.println("khong tim thay Album Muon xoa!");
		}
		WriteFile(List);
	}
	public void showAlbum() throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		sort();
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i));
		}
	}
	public void SelectAlbum(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		List=ReadFile();
		int a=0;
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getNameAlbum().equals(name)) {
				Main.menuSong(name);
				a++;
			}
		}
		if(a==0) {
			System.out.println("khong tim thay Album!");
		}
	}
	public void sort() throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<Album> List=ReadFile();
		Collections.sort(List);
		WriteFile(List);
	}
}
