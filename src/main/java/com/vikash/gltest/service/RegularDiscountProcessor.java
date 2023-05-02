package com.vikash.gltest.service;
public class RegularDiscountProcessor implements IDiscountProcessor{
    @Override
    public double processDiscount(Double purchaseAmount) {
        if (purchaseAmount <= 5000) {
            return 0;
        } else if (purchaseAmount <= 10000) {
            return 0.1 * (purchaseAmount - 5000);
        } else {
            return 0.2 * (purchaseAmount - 10000) + 0.1 * 5000;
        }
    }
}
