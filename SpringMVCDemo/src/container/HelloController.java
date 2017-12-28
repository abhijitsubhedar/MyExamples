package container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class HelloController {
	@RequestMapping(value="/display",method=RequestMethod.GET)
	
	public ModelAndView display() {
		return new ModelAndView("display","welcome","You are here");
		
	}
	@RequestMapping(value="/aboutUs",method=RequestMethod.GET)
	public ModelAndView about() {
		return new ModelAndView("aboutUs", "message","We are awsome");
		
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register(){
		return new ModelAndView("register", "message", "Register Your Details Here:");
		
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "message", "Login Here:");
		
	}

}
