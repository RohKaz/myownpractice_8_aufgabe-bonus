package org.example;

public class Car extends Vehicle implements Accelerateable{

    public Car(String id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        velocity += kmh;
        return velocity;
    }

    public int brake(int kmh) {
        velocity = 0;
        return velocity;
    }

    public int getVelocity() {
        return velocity;
    }






}
