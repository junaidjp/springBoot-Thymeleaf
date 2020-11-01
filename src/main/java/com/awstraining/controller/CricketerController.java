package com.awstraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.awstraining.service.CricketerService;

@Controller
public class CricketerController {
	
	private final CricketerService service;
	public CricketerController(CricketerService service) { 
		this.service = service;
	}
	
	@GetMapping("/cricketers.html")
	public String all(Model model) {
	model.addAttribute("cricketers", service.findAll());
	return "cricketers/list";
	}
}
