package com.kree.keehoo.webapp;

/**
 * Created by k on 03.03.17.
 */
public class Contact {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }
}
