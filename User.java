package CaseStudy;

import java.io.Serializable;

public class User implements Serializable {
	private int idUser;
	private String name;
	private String email;
	private String Username;
	private String passwd;
	private String passwd2;
	private boolean isAdmin;
	User(){}
	
	User(int idUser,String name, String email, String username, String passwd,String passwd2, boolean isAdmin) {
		super();
		this.idUser=idUser;
		this.name = name;
		this.email = email;
		Username = username;
		this.passwd = passwd;
		this.passwd2=passwd2;
		this.isAdmin=isAdmin;
	}
	
	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}
	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the passwd2
	 */
	public String getPasswd2() {
		return passwd2;
	}

	/**
	 * @param passwd2 the passwd2 to set
	 */
	public void setPasswd2(String passwd2) {
		this.passwd2 = passwd2;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", email=" + email + ", Username=" + Username + ", passwd="
				+ passwd + "]";
	}
	
}
