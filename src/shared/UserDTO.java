package shared;

public class UserDTO {
	
	//Users email also used as username in the system. 
	String email = "";

	//Password for the given user
	String passwd = "";
	//value of the activated stat
	int activated;

	public UserDTO(){
		
	}
	/**
	 * This construct creates a user with activated value 1
	 * @param email also used as username
	 * @param passwd 
	 */
	public UserDTO(String email, String passwd){
		this.email = email;
		this.passwd = passwd;
		this.activated = 1;
	}
	public UserDTO(String email, String passwd, int activated){
		this.email = email;
		this.passwd = passwd;
		this.activated = activated;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getActivated() {
		return activated;
	}
	public void setActivated(int activated) {
		this.activated = activated;
	}

	
}
