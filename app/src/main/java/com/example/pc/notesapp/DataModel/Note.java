package com.example.pc.notesapp.DataModel;

/**
 * Created by pc on 30/04/2017.
 */

public class Note {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Note(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name ;
    private String description;
}
