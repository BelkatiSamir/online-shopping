package net.kzn.onlineshopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView modele = new ModelAndView("page");
		modele.addObject("title", "Home");
		modele.addObject("userClickHome", true);
	 return modele;
	}
	
	
	
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView modele = new ModelAndView("page");
		modele.addObject("title", "About Us");
		modele.addObject("userClickAbout", true);
	 return modele;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView modele = new ModelAndView("page");
		modele.addObject("title", "Contact Us");
		modele.addObject("userClickContact", true);
	 return modele;
	}
	

	
}
