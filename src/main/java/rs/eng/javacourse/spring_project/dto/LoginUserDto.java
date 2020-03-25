package rs.eng.javacourse.spring_project.dto;

public class LoginUserDto {
	
	private String username, password;

	public LoginUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginUserDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUserDto [username=" + username + ", password=" + password + "]";
	}
	
	
}
