package thymeleaf.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("title", "Spring MVC with Thymeleaf");
		model.addAttribute("pageHeading", "Spring MVC with Thymeleaf");
		model.addAttribute("imgUrl", "http://www.thymeleaf.org/doc/tutorials/2.1/images/header.png");
		return "index";
	}

}