package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

  @RestController
public class CustomerController {
		@RequestMapping("/hello")
		public String index() {
			return "Heyyyy";
		}
		
}
