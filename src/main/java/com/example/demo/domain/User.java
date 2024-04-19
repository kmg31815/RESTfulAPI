package com.example.demo.domain;

/**
 * User Data Object not using DB
 */
public class User {

    private String name;
    private String jobTitle;
    private Info communicateInformation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Info getCommunicateInformation() {
        return communicateInformation;
    }

    public void setCommunicateInformation(Info communicateInformation) {
        this.communicateInformation = communicateInformation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", communicateInformation=" + communicateInformation +
                '}';
    }
}
