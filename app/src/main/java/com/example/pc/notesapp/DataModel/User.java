package com.example.pc.notesapp.DataModel;

import java.util.ArrayList;

/**
 * Created by pc on 30/04/2017.
 */

public class User {
    public User() {
        notes= new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ArrayList<Note> notes;
    String name;
    String password;
}
