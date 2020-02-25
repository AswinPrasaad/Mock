package com.mak.controller;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mak.service.BookServiceIntf;
import com.mak.dao.InventoryDao;
import com.mak.model.Book;
import com.mak.model.Customer;
import com.mak.model.Search;
import com.mak.service.CustomerService;
import com.mak.service.UserService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	BookServiceIntf bookService;

	@Autowired
	UserService userService;

	@Autowired
	InventoryDao dao;

	@RequestMapping("/admin")
	public void admin(Principal principal, HttpServletResponse res) {
		try {
			String loggedInUserName = principal.getName();
			System.out.println(loggedInUserName);
			Object loggedUser = (Object) userService.findByRole(loggedInUserName);
			if ((boolean) loggedUser.equals("M")) {
				// model.setViewName("ticketDetails");
				res.sendRedirect("/addbook");
			} else if ((boolean) loggedUser.equals("F")) {
				// model.setViewName("success");
				res.sendRedirect("/home");
			}
			System.out.println(loggedUser.toString());
			// return model;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@RequestMapping("/save")
	public ModelAndView saveCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult result) {

		System.out.println("result.hasErrors()" + result.hasErrors());
		if (result.hasErrors()) {
			return new ModelAndView("add-customer");
		}
		customerService.saveCustomer(customer);
		return new ModelAndView("redirect:show");
	}

	@RequestMapping("/show")
	public ModelAndView showCustomer() {

		List<Customer> customerlist = (List<Customer>) customerService.showCustomer();

		return new ModelAndView("show-customer", "customerlist", customerlist);
	}

	@RequestMapping(value = "/home")
	public ModelAndView homePage(Map<String, Object> map) {
		map.put("bookList", bookService.listBooks());
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/findProduct")
	public ModelAndView products(@ModelAttribute("Search") Search search, Model model, Map<String, Object> map) {
		System.out.println("The SearchItem is" + search.getSearchItem());
		map.put("bookList", bookService.searchBook(search.getSearchItem()));
		return new ModelAndView("home");
	}

	@RequestMapping("addbook")
	public ModelAndView addInventory(@ModelAttribute("inventory") Book inventory) {
		return new ModelAndView("addInventory");
	}

	@RequestMapping(value = "/savebook", method = RequestMethod.POST)
	public ModelAndView SavePage(@Valid @ModelAttribute("inventory") Book inventory, BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return new ModelAndView("addInventory").addObject("msg", "Please fill the mandatory fields");
		} else {
			dao.save(inventory);
		}

		return new ModelAndView("addInventory").addObject("msg", "Book details are successfull added");

	}
}
