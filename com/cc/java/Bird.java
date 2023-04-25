package com.cc.java;

public class Bird implements Flyable, Ifeathers{

    @Override
    public String fly() {
        return "I'm a bird I can fly without RedBull and faster than Bees!";

    }

    @Override
    public String hasFeathers() {
        return "I'm a bird, sure I have feathers u idiot!";
    }

    
    
}
