package com.emp.service.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpApiRestController {
    
	@GetMapping("/anis/{a}/{b}")
	public String getname(@PathVariable int a,@PathVariable int b) {
		return "add ===  "+(a+b);
	}
	
	@GetMapping("/aniss/{a}/{b}")
	public String getnamee(@PathVariable int a,@PathVariable int b) {

	}

	
	@GetMapping("/anisss/{a}/{b}")
	public String getnameee(@PathVariable int a,@PathVariable int b) {
		return "add ===  "+(a+b);
	}

//	@GetMapping("/aniss/{a}/{b}")
//	public String getnamee(@PathVariable int a,@PathVariable int b) {
//		return "add ===  "+(a+b);
//	}
//	@GetMapping("/aniss/{a}/{b}")
//	public String getnamee(@PathVariable int a,@PathVariable int b) {
//		return "add ===  "+(a+b);
//	}

}
