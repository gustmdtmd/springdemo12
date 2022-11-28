package part03.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// http://localhost:8090/myapp/login.do

import part03.dto.PersonDTO;

@Controller
public class LoginController {
	public LoginController() {
	
	}
	
	@RequestMapping("/login.do")
	public String loginProcess() {
		return "part03/loginForm";	
	}
	
	
	@RequestMapping("/logpro.do")
	public String loginExecution(String returnUrl, PersonDTO dto, HttpSession session) {
		if(dto.getId().equals("kim") && dto.getPass().equals("1234")) {
			session.setAttribute("chk", dto.getId());
			session.setMaxInactiveInterval(1000*60*30); //30분 후 자동 로그아웃
			System.out.println(session.getAttribute("chk"));
			if(returnUrl != "") {
				return "redirect:/" + returnUrl;
			}
		}
		return "redirect:/index.do";
	}
	
	@RequestMapping("/logout.do")
	public String logoutProcess(HttpSession session) {
		  session.removeAttribute("chk");
		return "redirect:/index.do";
	}
}//end class
