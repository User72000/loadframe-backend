package com.info.loanframe.dto;

public class FilterCitizenDTO {
    private String id;
    private String name;
    private Integer age;
    private String isCovidPositive;
    private String country;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public FilterCitizenDTO setId(String id) {
        this.id = id;
        return this;
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

    public String getIsCovidPositive() {
        return isCovidPositive;
    }

    public FilterCitizenDTO setIsCovidPositive(String isCovidPositive) {
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
