package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count")
public class CountController {
	
	@Autowired
	private CountService countService;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello der!!!";
	}
	
	@PostMapping("/payment_bulk_request_queue")
	public void increaseBulkRequestCount() {
		countService.increaseBulkRequestCount();
	}
	
	@PostMapping("/digipay_merchant_callback")
	public void increaseMerchantCallbackCount() {
		countService.increaseMerchantCallbackCount();
	}
	
	@PostMapping("/digipaypaymentstatus")
	public void increaseDigipaypaymentstatusCount() {
		countService.increaseDigipaypaymentstatusCount();
	}
	
	@GetMapping("/payment_bulk_request_queue_count")
	public Integer getBulkRequestCount() {
		return countService.getBulkRequestCount();
	}
	
	@GetMapping("/digipay_merchant_callback_count")
	public Integer getMerchantCallbackCount() {
		return countService.getMerchantCallbackCount();
	}
	
	@GetMapping("/digipaypaymentstatus_count")
	public Integer getDigipaypaymentstatusCount() {
		return countService.getDigipaypaymentstatusCount();
	}
	
}
