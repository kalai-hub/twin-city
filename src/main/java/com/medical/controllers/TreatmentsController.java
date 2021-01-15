package com.medical.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medical.model.Treatments;
import com.medical.services.TreatmentsService;

@Controller
public class TreatmentsController {
	@Autowired
	TreatmentsService treatmentsService;

	// Request mapping maps web request to the controller method
	@RequestMapping(value = "/showTreatments", method = RequestMethod.GET)
	public String listTreatments(Model model) {

		// Get all treatments
		List<Treatments> treatments = treatmentsService.findAll();

		// Add the attribute
		model.addAttribute("treatments", treatments);

		// Return the page
		return "showTreatments";
	}

}