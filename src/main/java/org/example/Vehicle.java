package org.example;

public abstract class Vehicle implements Accelerateable{

    String id;
    String name;
    int velocity;

    @Override
    public int accelerate(int kmh) {
        return 0;
    }
}
