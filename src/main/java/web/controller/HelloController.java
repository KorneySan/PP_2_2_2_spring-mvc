package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.3.14 version by dec'21 ");
		model.addAttribute("messages", messages);
		List<String> links = new ArrayList<>();
		links.add("==> Автомобили <==");
		model.addAttribute("links", links);
		return "index";
	}
	
}