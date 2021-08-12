package com.eis.insurance.model;

public enum CoverageOptionEnum {
    COLLISION("автогражданка"),
    COMPREHENSIVE("автогражданка");

    private String value;

    CoverageOptionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
