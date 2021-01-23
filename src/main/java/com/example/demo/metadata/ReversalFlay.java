package com.example.demo.metadata;

import com.example.demo.mapper.MyEnumConverter;

/**
 * 冲账标记 正常,补账 冲账交易
 * @author Pactera
 */
public enum ReversalFlay {
    N,A,R;
    public static class Converter extends MyEnumConverter<ReversalFlay>{

        @Override
        protected Class<ReversalFlay> getEnumClass() {
            return ReversalFlay.class;
        }
    }
}
