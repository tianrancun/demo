package com.example.demo.mapper;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductPrice {
    private String prdName;
    private BigDecimal price1;
    private BigDecimal price2;
    private BigDecimal price3;

    public ProductPrice(String prdName, BigDecimal price1, BigDecimal price2, BigDecimal price3) {
        this.prdName = prdName;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }
}
