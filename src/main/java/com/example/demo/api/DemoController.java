package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

	@GetMapping("/update/status")
				public void updateStatus() {

	}

}
