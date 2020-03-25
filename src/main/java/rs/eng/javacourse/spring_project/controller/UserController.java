package rs.eng.javacourse.spring_project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rs.eng.javacourse.spring_project.dao.UsersRepository;
import rs.eng.javacourse.spring_project.dto.LoginUserDto;
import rs.eng.javacourse.spring_project.service.LoginService;

@Controller
public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		request.setAttribute("users", UsersRepository.users);
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		return new ModelAndView("add");
	}
	
	@RequestMapping(value = "/ading", method = RequestMethod.POST)
	public ModelAndView ading(@ModelAttribute("user") LoginUserDto user, HttpServletRequest request) {
		UsersRepository.add(user);
		request.setAttribute("added", "User dodat");
		return new ModelAndView("add");
	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public String auth(@ModelAttribute("user") LoginUserDto user, HttpServletRequest request) {
		boolean provera = LoginService.auth(user);
		if (provera) {
			return "redirect:/home";
		} else {
			request.setAttribute("err", "Pogresan username ili password ...");
			return "login";
		}
	}

	@ModelAttribute(name = "user")
	public LoginUserDto addAttributes(LoginUserDto user) {
		return new LoginUserDto("", "");
	}

}
