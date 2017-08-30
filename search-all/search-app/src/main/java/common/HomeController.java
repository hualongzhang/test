package common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public ModelAndView home() {
         String message = "Hello world from Spring MVC";
         return new ModelAndView("home", "message", message);
	}

}
