package com.spring.project.springbootproject.dtos;

public class BlogDTO {
    private String uuid;
    private String name;

    public BlogDTO(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public BlogDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
