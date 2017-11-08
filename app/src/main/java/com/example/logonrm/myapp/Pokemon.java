package com.example.logonrm.myapp;

import java.util.List;

/**
 * Created by logonrm on 08/11/2017.
 */

public class Pokemon {

    private String name;

    private List<Types> types;

    private Sprites sprites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }
}
