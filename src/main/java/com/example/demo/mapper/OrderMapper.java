package com.example.demo.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderQueryParam entity2queryParam(Order order);
}
