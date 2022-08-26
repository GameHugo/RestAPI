package me.gamehugo.restapi.cat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatManager {
    private final List<Cat> cats = new ArrayList<>();

    public CatManager() {
        addCat(new Cat("test", new Date(1000)));
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public List<Cat> getByName(String name) {
        List<Cat> result = new ArrayList<>();
        for (Cat cat : cats) {
            if(cat.getName().equals(name)) result.add(cat);
        }
        return result;
    }
}
