package com.java.streams;
import java.util.*;
import java.util.stream.Collectors;
public class StreamMapDemo {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Simran", "secrets", "simran@gmail.com"));
		users.add(new User(2, "Tejas", "secrets", "tejas@gmail.com"));
		users.add(new User(3, "Indira", "secrets", "indira@gmail.com"));
		
		List<UserDTO> usersDTO = new ArrayList<>();
		//old legacy way
		for (User user: users) {
			usersDTO.add(new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
		}
		System.out.println(usersDTO);
		
		//new map Java 8 feature
		List<UserDTO> usersDTOmap =users.stream().map(user -> new UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList());
		System.out.println(usersDTOmap);

	}

}
class UserDTO {
	private int id;
	private String userName;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	
}
class User {
	private int id;
	private String userName;
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
}
