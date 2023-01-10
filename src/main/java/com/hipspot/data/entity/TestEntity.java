package com.hipspot.data.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class TestEntity {

    @Id
    String Testid;

    public String getTestid() {
        return Testid;
    }

    public void setId(String id) {
        this.Testid = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String title;
    String content;

    @Builder
    public TestEntity(String testid, String title, String content) {
        Testid = testid;
        this.title = title;
        this.content = content;
    }
}
