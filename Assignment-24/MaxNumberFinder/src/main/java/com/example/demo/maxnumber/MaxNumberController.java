package com.example.demo.maxnumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MaxNumberController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/maxnumber")
	public String findMaxNumber(@RequestParam int num1, @RequestParam int num2, @RequestParam int num3, Model model) {
		int max = Math.max(num1, Math.max(num2, num3));
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("num3", num3);
		model.addAttribute("max", max);
		return "result";
	}
}
