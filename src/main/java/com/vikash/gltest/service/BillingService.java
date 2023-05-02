package com.vikash.gltest.service;

import com.vikash.gltest.model.Customer;
import com.vikash.gltest.processor.factory.DiscountProcessorFactory;
import com.vikash.gltest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {
    @Autowired
    CustomerRepository customerRepository;

    public double getDiscountAmount(Integer customerId, Double purchaseAmount) {

        Customer customer = customerRepository.getCustomerById(customerId);

        IDiscountProcessor discountProcessor = DiscountProcessorFactory.getProcessorInstance(customer.getCustomerType());

        return discountProcessor.processDiscount(purchaseAmount);
    }
}
