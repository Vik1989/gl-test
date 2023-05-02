package com.vikash.gltest.service;

public class PremiumDiscountProcessor implements IDiscountProcessor{
    @Override
    public double processDiscount(Double purchaseAmount) {

        double totalDiscount = 0;

        if(purchaseAmount <= 4000) {
            totalDiscount = 0.1 * purchaseAmount;
        } else if (purchaseAmount <= 8000) {
            totalDiscount = 0.15 * (purchaseAmount - 4000) + 0.1 * 4000;
        } else if (purchaseAmount <= 12000) {
            totalDiscount = 0.2 * (purchaseAmount - 8000) + 0.15 * 4000 + 0.1 * 4000;
        }
        else {
            totalDiscount = 0.3 * (purchaseAmount - 12000) + 0.2 * 4000 + 0.15 * 4000 + 0.1 * 4000;
        }

        return totalDiscount;
    }
}
