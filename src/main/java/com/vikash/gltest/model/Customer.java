package com.vikash.gltest.model;

import com.vikash.gltest.enums.CustomerEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    Integer id;
    CustomerEnum customerType;
    String name;
    String address;
}
