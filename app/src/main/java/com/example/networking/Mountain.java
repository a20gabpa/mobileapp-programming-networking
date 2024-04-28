package com.example.networking;

public class Mountain {
    private String _name;   // Private member variable for the name

    /* Constructor */
    public Mountain(String name) {
        this._name = name;
    }

    /* Getter */
    public String GetName() { return _name; }

    /* Setter */
    public void ChangeName(String newName) { this._name = newName; }
}
