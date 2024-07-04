package com.example.demo.factorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FactorialController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/factorial")
	public String calculateFactorial(@RequestParam int number, Model model) {
		long result = factorial(number);
		model.addAttribute("number", number);
		model.addAttribute("result", result);
		return "result";
	}

	private long factorial(int number) {
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
}
