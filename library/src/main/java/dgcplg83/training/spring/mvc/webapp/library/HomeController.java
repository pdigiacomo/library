package dgcplg83.training.spring.mvc.webapp.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public ModelAndView test() {
	String message = "Welcome to Spring 4.0 !";
	return new ModelAndView("hello", "message", message);
    }
}
