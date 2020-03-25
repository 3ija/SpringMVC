package rs.eng.javacourse.spring_project.dao;

import java.util.ArrayList;
import java.util.List;

import rs.eng.javacourse.spring_project.dto.LoginUserDto;

public class UsersRepository {

	public static List<LoginUserDto> users = new ArrayList<>();
	
	static {
		users.add(new LoginUserDto("root", "root"));
	}
	
	public static void add(LoginUserDto user) {
		users.add(user);
	}
}
