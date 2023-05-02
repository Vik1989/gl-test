package com.vikash.gltest.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PremiumDiscountProcessorTest {
    PremiumDiscountProcessor subject = new PremiumDiscountProcessor();

    @Test
    public void shouldReturn400Discount_whenBillIsLessThanOrEqualTo4000() {

        assertEquals(400,subject.processDiscount(4000.0));

    }
}