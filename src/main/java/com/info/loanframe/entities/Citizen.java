package com.info.loanframe.entities;

import com.info.loanframe.enums.CovidStatus;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Citizen {

    @NotBlank(message = "Please provide name")
    private String name;

    @NotNull(message = "Please Provide age")
    private Integer age;

    @NotNull(message = "please provide COVID status")
    private Enum<CovidStatus> isCovidPositive;

    @NotBlank(message = "Please provide country name")
    private String country;

    public String getName() {
        return name;
    }

    public Citizen setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Citizen setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Enum<CovidStatus> getIsCovidPositive() {
        return isCovidPositive;
    }

    public Citizen setIsCovidPositive(Enum<CovidStatus> isCovidPositive) {
        this.isCovidPositive = isCovidPositive;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Citizen setCountry(String country) {
        this.country = country;
        return this;
    }
}
