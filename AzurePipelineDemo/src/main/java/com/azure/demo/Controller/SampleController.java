package com.azure.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
	
	@GetMapping("/sample")
	public String sampleMethod() {
		return "This is Azure Pipeline Sample method";
	}

}
