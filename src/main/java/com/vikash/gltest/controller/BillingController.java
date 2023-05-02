package com.vikash.gltest.controller;

import com.vikash.gltest.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@Autowired
	BillingService billingService;

	@GetMapping("/bill/{cId}/{amount}")
	public ResponseEntity<Double> getFinalAmount(@PathVariable("cId") Integer customerId, @PathVariable("amount") Double purchaseAmount) {

		double totalDiscount = billingService.getDiscountAmount(customerId, purchaseAmount);

		return ResponseEntity.ok(purchaseAmount - totalDiscount);
	}
}
