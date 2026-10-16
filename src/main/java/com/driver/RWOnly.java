package com.driver;

public class RWOnly {
    private String name;

    public String getter(String name)
    {
        return name;
    }

    public String setter(String name)
    {
        this.name = name;
    }
}
