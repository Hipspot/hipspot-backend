package com.hipspot.data.dto;

public class testDTO {
    private String title;
    private String content;

    public testDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "testDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
