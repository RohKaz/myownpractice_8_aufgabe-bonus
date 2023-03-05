package org.example;

public class Bicycle extends Vehicle implements Accelerateable {


    public Bicycle(String id, String name, int velocity) {
        super(id, name, velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    @Override
    public int accelerate(int kmh) {
        if (getVelocity() + kmh >= 35) {
            velocity = 35;
            return velocity;
        }
        velocity += kmh;
        return velocity;
    }

    @Override
    public int brake(int kmh) {
        velocity = 0;
        return velocity;
    }
}
