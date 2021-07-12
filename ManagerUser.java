package CaseStudy;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class ManagerUser {
	static Scanner sc=new Scanner(System.in);
	public ManagerUser() throws ClassNotFoundException, FileNotFoundException, IOException {
		try{
			WriteFile(ReadFile());
		}catch(IOException e) {
			WriteFile(new ArrayList<User>());
		}
	}
	public User createUser() {
		System.out.println("1. ID User");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("2.Name");
		String name=sc.nextLine();
		System.out.println("3. Email");
		String Email=sc.nextLine();
		System.out.println("4. Username");
		String Username=sc.nextLine();
		System.out.println("5. Passwd");
		String passwd=sc.nextLine();
		System.out.println("6. Passwd2");
		String passwd2=sc.nextLine();
		System.out.println("7. isAdmin");
		boolean isAdmin=Boolean.parseBoolean(sc.nextLine());
		return new User(id,name,Email,Username,passwd,passwd2,isAdmin);
	}
	public void addUser() throws ClassNotFoundException, IOException {
		int a=0;
		ArrayList<User> ListUser=ReadFile();
		User User=createUser();
		for(int i=0;i<ListUser.size();i++) {
			if(ListUser.get(i).getUsername().equals(User.getUsername())) {
				System.out.println("Username Da ton tai");
				a++;
			}
		}
		if(a==0) {
			ListUser.add(User);
			
		}
		WriteFile(ListUser);
	}
	public void forgotPasswd(String name) throws ClassNotFoundException, IOException {
		ArrayList<User> ListUser=ReadFile();
		for(int i=0;i<ListUser.size();i++) {
			if(ListUser.get(i).getUsername().equals(name)) {
				System.out.println("Nhap passwd2");
				String passwd2=sc.nextLine();
				if(ListUser.get(i).getPasswd2().equals(passwd2)) {
					System.out.println("New passwd: ");
					String newpasswd1=sc.nextLine();
					System.out.println("xac nhan lai passwd");
					String newpasswd2=sc.nextLine();
					if(newpasswd1.equals(newpasswd2)) {
						ListUser.get(i).setPasswd(newpasswd1);
					}else System.out.println("Error xac nhan passwd");
				}else System.out.println("Sai passwd2!");
			}
		}
		WriteFile(ListUser);
	}
	public void Authenication(String Username, String Passwd) throws FileNotFoundException, ClassNotFoundException, IOException {
		int a=0;
		ArrayList<User> ListUser=ReadFile();
		for(int i=0;i<ListUser.size();i++) {
			if(ListUser.get(i).getUsername().equals(Username)) {
				a++;
				if(ListUser.get(i).getPasswd().equals(Passwd)) {
					if(ListUser.get(i).isAdmin()) {
						Main.MenuAlbumAdmin();
						break;
					}else{
						Main.MenuAlbumUser();
						break;
					}
				}else {
					System.out.println("Sai  passwd!");
					break;
				}
			}
		}
		if(a==0) {
			System.out.println("User khong ton tai!");
		}
	}
	public ArrayList<User> ReadFile() throws IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CaseStudy\\src\\CaseStudy\\File\\User.txt"));
		ArrayList<User> List= (ArrayList<User>) ois.readObject();
		ois.close();
		return List;
	}
	public void WriteFile(ArrayList<User> List) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\CaseStudy\\src\\CaseStudy\\File\\User.txt"));
		oos.writeObject(List);
		oos.close();
	};
}
