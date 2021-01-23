package com.example.demo.mapper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class GenderJsonSerializer extends JsonSerializer {
    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        log.info("【 GenderJsonSerializer.serialize() 】  value ==> " + value);
        if (value.equals(1)) {
            gen.writeString("男");
        } else if (value.equals(0)) {
            gen.writeString("女");
        }
    }
}
