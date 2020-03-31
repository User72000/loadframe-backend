package com.info.loanframe.entities;

import com.info.loanframe.enums.CovidStatus;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Citizen {

    @NotBlank(message = "Please provide name")
    private String name;

    @NotNull(message = "Please Provide age")
    private Integer age;

    @NotNull(message = "please provide COVID status")
    @Pattern(regexp = "YES|NO|Yes|No", message = "Please Provide YES or No for isCovidPositive")
    private String isCovidPositive;

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
        return CovidStatus.valueOf(isCovidPositive);
    }

    public Citizen setIsCovidPositive(String isCovidPositive) {
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
