package com.vikash.gltest.processor.factory;

import com.vikash.gltest.enums.CustomerEnum;
import com.vikash.gltest.service.IDiscountProcessor;
import com.vikash.gltest.service.PremiumDiscountProcessor;
import com.vikash.gltest.service.RegularDiscountProcessor;

import java.util.Map;

public class DiscountProcessorFactory {

    public static Map<CustomerEnum, IDiscountProcessor> discountProcessorInstanceMap = Map.of(CustomerEnum.PREMIUM, new PremiumDiscountProcessor(),
                                                                                CustomerEnum.REGULAR, new RegularDiscountProcessor());

    public static IDiscountProcessor getProcessorInstance(CustomerEnum customerEnum) {
        return discountProcessorInstanceMap.get(customerEnum);
    }
}
