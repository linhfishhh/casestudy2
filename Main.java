package CaseStudy;
import java.util.Scanner;
import java.io.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void menuSong(String name) throws FileNotFoundException, ClassNotFoundException, IOException {
		ManageSong m=new ManageSong();
		while(true) {
			System.out.println("_____________Manage Song______________");
			System.out.println("|            1. ADD Song              |");
			System.out.println("|            2. Edit Song             |");
			System.out.println("|            3. Remove Song           |");
			System.out.println("|            4. Show Song             |");
			System.out.println("|            5. exit                  |");
			System.out.println("|_____________________________________|");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				m.addSong(name);
				break;
			case 2:
				m.EditSong(name);
				break;
			case 3:
				m.removeSong(name);
				break;
			case 4:
				m.showSong(name);
				break;
			case 5:
				Main.MenuAlbumAdmin();
				break;
			}			
		}
	}
	public static void MenuAlbumUser() throws FileNotFoundException, ClassNotFoundException, IOException {
		ManagerAlbum m=new ManagerAlbum();
		while(true) {
			System.out.println("____________Manage Album User__________");
			System.out.println("|            1.select ALbum            |");
			System.out.println("|               2.show                 |");
			System.out.println("|               3.exit                 |");
			System.out.println("|______________________________________|");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.println("Select Album Name");
				String name2=sc.nextLine();
				m.SelectAlbum(name2);
				break;
			case 2:
				m.showAlbum();
				break;
			default :
				Main.Authen();
			}
		}
	}
	public static void MenuAlbumAdmin() throws FileNotFoundException, ClassNotFoundException, IOException {
		ManagerAlbum m=new ManagerAlbum();
		while(true) {
			System.out.println("____________Manage Album Admin__________");
			System.out.println("|               1.Add                  |");
			System.out.println("|               2.edit                 |");
			System.out.println("|              3.remove                |");
			System.out.println("|            4.select ALbum            |");
			System.out.println("|               5.show                 |");
			System.out.println("|               6.exit                 |");
			System.out.println("|______________________________________|");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				m.addAlbum();
				break;
			case 2:
				System.out.println("Name Album edit: ");
				String name=sc.nextLine();
				m.EditAlbum(name);
				break;
			case 3:
				System.out.println("Name Album remove: ");
				String name1=sc.nextLine();
				m.removeAlbum(name1);
				break;
			case 4:
				System.out.println("Select Album Name");
				String name2=sc.nextLine();
				m.SelectAlbum(name2);
				break;
			case 5:
				m.showAlbum();
				break;
			default :
				Main.Authen();
			}
		}
	}
	public static void Authen() throws FileNotFoundException, ClassNotFoundException, IOException {
		ManagerUser MUser=new ManagerUser();
		while(true) {
		System.out.println("______________LOGIN_______________");
		System.out.println("|         1.Dang nhap             |");
		System.out.println("|         2.Resgiter              |");
		System.out.println("|         3. Forgot Passwd        |");
		System.out.println("|         4. Exit                 |");
		System.out.println("|_________________________________|");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Username");
			String Username=sc.nextLine();
			System.out.println("Passwd");
			String Passwd=sc.nextLine();
			MUser.Authenication(Username, Passwd);
			break;
		case 2:
			MUser.addUser();
			break;
		case 3:
			System.out.println("Nhap Username");
			String Username1=sc.nextLine();
			MUser.forgotPasswd(Username1);
			break;
		default:
			System.exit(0);
		}
	}
	}
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Main.Authen();
	}
}
