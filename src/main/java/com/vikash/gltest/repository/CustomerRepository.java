package com.vikash.gltest.repository;

import com.vikash.gltest.enums.CustomerEnum;
import com.vikash.gltest.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    public Customer getCustomerById(Integer customerId) {

        if(customerId == 1) {
            return Customer.builder()
                    .customerType(CustomerEnum.PREMIUM)
                    .id(customerId)
                    .name("Cust-A")
                    .build();
        } else {
            return Customer.builder()
                    .customerType(CustomerEnum.REGULAR)
                    .id(customerId)
                    .name("Cust-B")
                    .build();
        }
    }
}
