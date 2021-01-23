package com.example.demo.mapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class GenderJsonDeserializer extends JsonDeserializer {
    @Override
    public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (ObjectUtils.isEmpty(p)) {
            return null;
        }

        int gender = 0;

        switch (p.getText()) {
            case "男":
                gender = 1;
                break;
            case "女":
                break;
            default:
                throw new RuntimeException("传入的性别为非法字符！");
        }

        log.info("【 GenderJsonDeserializer.deserialize() 】  p.getText() ==> "
                + p.getText() + "，转换后的结果 ==> " + gender);

        return gender;
    }
}
