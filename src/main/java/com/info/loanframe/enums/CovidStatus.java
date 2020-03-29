package com.info.loanframe.enums;

public enum CovidStatus {
    YES("Yes"),
    NO("No");
    private final String status;

    CovidStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
