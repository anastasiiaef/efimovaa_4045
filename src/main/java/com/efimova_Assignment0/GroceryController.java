package com.efimova_Assignment0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.efimova_Assignment0.dto.GroceryDTO;
import com.efimova_Assignment0.service.IGroceryService;

@Controller
public class GroceryController {
	
	@Autowired
	private IGroceryService groceryServiceStub;
	
	/**
	 * Handle the /index endpoint.
	 * @return
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	@ResponseBody
	public GroceryDTO read(Model model) {
		GroceryDTO groceryDTO = groceryServiceStub.fetchById(9);
		model.addAttribute("groceryDTO", groceryDTO);
		return groceryDTO;
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, params = {"loyalty=blue"})
	public ModelAndView readBlue() {
		GroceryDTO groceryDTO = groceryServiceStub.fetchById(9);
		groceryDTO.setGroceryId(12);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("groceryDTO", groceryDTO);
		return modelAndView;
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "index";
	}
	
	@RequestMapping(value="/addgrocery", method=RequestMethod.GET)
	public String addGrocery(Model model, @RequestParam(value="category", required=false, defaultValue=" ") String category) {
		GroceryDTO groceryDTO = groceryServiceStub.fetchById(9);
		groceryDTO.setCategory(category);
		model.addAttribute("groceryDTO", groceryDTO);
		return "index";
	}
	
	@PostMapping("/index")
	public String create() {
		return "index";
	}
	
	/**
	 * Handle the /endpoint.
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
