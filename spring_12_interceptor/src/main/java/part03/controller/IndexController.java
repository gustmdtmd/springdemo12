package part03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/index.do

@Controller
public class IndexController {

	public IndexController() {
	
	}
	
	@RequestMapping("/index.do")
	public String process() {
		return "part03/index";
	}
}//end class
