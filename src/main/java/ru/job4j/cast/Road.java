package ru.job4j.cast;

public class Road {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, airplane};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
