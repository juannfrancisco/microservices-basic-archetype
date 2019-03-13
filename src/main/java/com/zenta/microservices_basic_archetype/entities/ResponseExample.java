package com.zenta.microservices_basic_archetype.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseExample {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
