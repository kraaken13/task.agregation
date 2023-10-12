package com.tasks.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Train[] trainArray = new Train[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < trainArray.length; i++) {

            System.out.print("Enter destination for train " + (i + 1) + ": ");

            String destination = scanner.nextLine();

            System.out.print("Enter train number: ");

            int trainNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter departure time: ");

            String departureTime = scanner.nextLine();

            trainArray[i] = new Train(destination, trainNumber, departureTime);

        }

        Arrays.sort(trainArray, Comparator.comparingInt(train -> train.trainNumber));

        System.out.print("Enter train number to get information: ");

        int userTrainNumber = Integer.parseInt(scanner.nextLine());

        boolean foundTrain = false;

        for (Train train : trainArray) {

            if (train.trainNumber == userTrainNumber) {

                System.out.println("Information about train " + userTrainNumber + ":");

                System.out.println(train);

                foundTrain = true;

                break;

            }

        }

        if (!foundTrain) {

            System.out.println("Train with number " + userTrainNumber + " not found.");

        }


        Arrays.sort(trainArray, Comparator.comparing((Train train) -> train.destination)

                .thenComparing(train -> train.departureTime));


        System.out.println("Sorted train list:");

        for (Train train : trainArray) {

            System.out.println(train);
        }
    }
}