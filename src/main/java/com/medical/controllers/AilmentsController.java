package com.medical.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medical.model.Ailments;
import com.medical.services.AilmentsService;

@Controller
public class AilmentsController {
	@Autowired
	AilmentsService ailmentsService;

	// Request mapping maps web request to the controller method
	@RequestMapping(value = "/showAilments", method = RequestMethod.GET)
	public String listAilments(Model model) {
		// Get all ailments information
		List<Ailments> ailments = ailmentsService.findAll();

		// Add attribute
		model.addAttribute("ailments", ailments);

		// Return Page
		return "showAilments";
	}

}