package org.example;

public abstract class Vehicle implements Accelerateable{

    String id;
    String name;
    int velocity;

    @Override
    public int accelerate(int kmh) {
        return 0;
    }

    public Vehicle(String id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public Vehicle() {
    }

    public int getVelocity() {
        return velocity;
    }
}
