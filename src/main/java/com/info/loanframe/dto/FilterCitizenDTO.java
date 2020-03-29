package com.info.loanframe.dto;

import com.info.loanframe.enums.CovidStatus;

public class FilterCitizenDTO {
    private String name;
    private Integer age;
    private Enum<CovidStatus> isCovidPositive;
    private String country;

    public String getName() {
        return name;
    }

    public FilterCitizenDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public FilterCitizenDTO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Enum<CovidStatus> getIsCovidPositive() {
        return isCovidPositive;
    }

    public FilterCitizenDTO setIsCovidPositive(Enum<CovidStatus> isCovidPositive) {
        this.isCovidPositive = isCovidPositive;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public FilterCitizenDTO setCountry(String country) {
        this.country = country;
        return this;
    }
}
