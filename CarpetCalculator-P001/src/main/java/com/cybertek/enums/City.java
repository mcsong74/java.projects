package com.cybertek.enums;

public enum City {
    DALLAS("Dallas, TX"),
    AUSTIN("Austin, TX"),
    SAN_ANTONIO("San Antonio, TX"),
    ARLINGTON("Arlington, VA"),
    FAIRFAX("Fairfax, VA"),
    MCLEAN("McClean, VA");

    private String value;

    City(String value) {
        this.value = value;
    }


}
