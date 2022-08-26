package me.gamehugo.restapi.cat;

import java.util.Date;

public class Cat {
    public String name;
    public Date born;

    public Cat(String name, Date born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }
    public Date getBorn() {
        return born;
    }
}
