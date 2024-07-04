package com.example.demo.evennumberweb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EvenNumberController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/evennumbers")
	public String findEvenNumbers(@RequestParam String numbers, Model model) {
		List<Integer> numberList = Stream.of(numbers.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> evenNumbers = numberList.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		model.addAttribute("evenNumbers", evenNumbers);
		return "result";
	}
}
