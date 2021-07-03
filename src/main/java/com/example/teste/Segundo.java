package com.example.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Segundo {

	@GetMapping("/outro")
	public String hello() {
		return "Bababa";
	}
}