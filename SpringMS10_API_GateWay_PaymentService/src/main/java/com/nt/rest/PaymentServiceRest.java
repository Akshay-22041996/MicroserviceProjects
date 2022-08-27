package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/service")
public class PaymentServiceRest {

	@GetMapping("/explore")
	public String showPaymentMsg() {
		return "Payment Rest method is executed";
	}
}
