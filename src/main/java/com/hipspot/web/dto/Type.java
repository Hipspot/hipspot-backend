package com.hipspot.web.dto;

import lombok.Getter;

@Getter
public class Type {
    private String type;

    public Type(String type) {
        this.type = type;
    }
}
