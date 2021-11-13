package com.cos.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MasterController {

	@GetMapping("Master/KeyCode/Crate")
	public String KeyCode_Crate() {
		return "12345";
	}
}
