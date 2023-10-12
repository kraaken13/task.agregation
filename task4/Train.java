package com.tasks.task4;

public class Train {
    String destination;

    int trainNumber;

    String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {

        this.destination = destination;

        this.trainNumber = trainNumber;

        this.departureTime = departureTime;

    }

    public String toString() {

        return "Train: " + trainNumber + ", Destination: " + destination + ", Departure Time: " + departureTime;
    }
}
