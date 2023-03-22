package DoAnSpringMVC.Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DoAnSpringMVC.Entity.Slides;


@Controller
public class HomeController {
	@Autowired
	
	@RequestMapping(value= {"/", "/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		return mv;
	}
	
	@RequestMapping(value= "/product")
	public ModelAndView Product(Model m) {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
	
}
