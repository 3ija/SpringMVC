package rs.eng.javacourse.spring_project.service;

import java.util.List;

import rs.eng.javacourse.spring_project.dao.UsersRepository;
import rs.eng.javacourse.spring_project.dto.LoginUserDto;

public class LoginService {

	public static boolean auth(LoginUserDto user) {
		List<LoginUserDto> users = UsersRepository.users;
		for(LoginUserDto temp : users) {
			if( user.getUsername().equals(temp.getUsername()) && user.getPassword().equals(temp.getPassword())) {
				return true;
			}
		}
		return false;
	}

	
	
}
