package com.example.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping("/listar-produto")
	public String hello() {
		return "Ola mundo";
	}

    @GetMapping("/xxx")
	public String xxx() {
		return "xxx";
	}
}