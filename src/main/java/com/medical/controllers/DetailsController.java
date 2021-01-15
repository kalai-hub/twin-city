package com.medical.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medical.model.Details;
import com.medical.services.DetailsService;

@Controller
public class DetailsController {

	@Autowired
	DetailsService detailsService;

	// Request mapping maps web request to the controller method
	@RequestMapping(value = "/showDetails", method = RequestMethod.GET)
	public String listDetails(Model model) {

		// Get all details
		List<Details> details = detailsService.findAll();

		// Add the attribute
		model.addAttribute("details", details);

		// Return the page
		return "showDetails";
	}

}