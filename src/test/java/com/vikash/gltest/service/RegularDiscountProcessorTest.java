package com.vikash.gltest.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class RegularDiscountProcessorTest {

    RegularDiscountProcessor subject = new RegularDiscountProcessor();
    @Test
    public void shouldReturnZeroDiscount_whenBillIsLessThanOrEqualTo5000() {

        assertEquals(0,subject.processDiscount(5000.0));

    }

    @Test
    public void shouldReturnDiscount_whenBillIsLessThanOrEqualTo10000() {

        assertEquals(500,subject.processDiscount(10000.0));

    }
}
