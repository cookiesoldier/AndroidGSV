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

	
}
