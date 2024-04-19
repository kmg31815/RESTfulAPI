package com.example.demo.dto;

import com.example.demo.domain.Info;

/**
 * User Data Transfer Object
 */
public class UserDto {

    private String name;
    private String job_title;
    private Info communicate_information;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Info getCommunicate_information() {
        return communicate_information;
    }

    public void setCommunicate_information(Info communicate_information) {
        this.communicate_information = communicate_information;
    }
}
