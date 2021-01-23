package com.example.demo.mapper;

import com.fasterxml.jackson.databind.util.StdConverter;
import org.apache.commons.lang3.EnumUtils;

public abstract class MyEnumConverter<TypeEnum extends Enum<TypeEnum>> extends StdConverter<String,TypeEnum> {
    @Override
    public TypeEnum convert(String enumName) {
//        return EnumUtils.getEnum(getEnumClass(),name);
        if (enumName == null) {
            return null;
        } else {
            try {
                return Enum.valueOf(getEnumClass(), enumName);
            } catch (IllegalArgumentException var3) {
                    throw  new IllegalArgumentException("非法枚举"+enumName);
            }
        }
    }

    protected abstract Class<TypeEnum> getEnumClass();

}
