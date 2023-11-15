
package com.cg.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Customer;

import com.cg.service.CustomerService;
 
@Controller

public class CustomerController {

	@Autowired

	CustomerService service;

	@RequestMapping("/product")

	 public String viewHomePage(Model model) {

		List<Customer> listcustomers=service.listAll();

		model.addAttribute("listcustomers",listcustomers);
			
		for(Customer c: listcustomers) {

			System.out.println("data"+c.getId()+c.getName());

		}

		return "index";
}
	@RequestMapping("/new")
	public String showNewCustomerPage(Model model) {
		//System.out.println("hello");
		Customer customer=new Customer();
		model.addAttribute("Customer",customer);
		return "new_customer";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("Customer") Customer customer) {
	    service.save(customer);
	    return "redirect:/customer";
	}
	@RequestMapping("/delete/{id}")
	public String deleteProdut(@PathVariable(name="id") Long id) {
	    service.delete(id);
	    return "redirect:/customer";
}
	@RequestMapping("edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id") Long id) {
	 ModelAndView mav=new ModelAndView("edit_customer");
	 Customer customer=service.get(id);
	 mav.addObject("customer",customer);
	 return mav;
 
}
	
}