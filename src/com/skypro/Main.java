package com.skypro;

public class Main {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        for (int i=1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");


        //Task 2
        System.out.println("Task 2");
        int firstFriday = 5;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Today is Friday " + firstFriday + "th. Please, prepare your report");
        }
        System.out.println("-----------------------");


        //Task 3
        System.out.println("Task 3");
        int timeRange = 79;
        int currentYear = 2022;
        int twoHundredYearsBefore = currentYear - 200;
        int oneHundredYearsAfter = currentYear + 100;

        for (; twoHundredYearsBefore <= oneHundredYearsAfter; twoHundredYearsBefore++) {
            if (twoHundredYearsBefore % timeRange == 0) {
                System.out.println(twoHundredYearsBefore);
            }
        }
        System.out.println("-----------------------");


        //Task 4
        System.out.println("Task 4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println(i +  ": Ping Pong");
                }
                System.out.println(i +  ": Ping");
            } else if (i % 5 == 0) {
                System.out.println(i +  ": Pong");
            } else  {
                System.out.println(i + ":");
            }
        }
        System.out.println("-----------------------");


        //Task 5
        System.out.println("Task 5");
        int firstValue = 0;
        int secondValue = 1;
        int nextFibonachiValue;
        System.out.print(firstValue + " ");
        System.out.print(secondValue + " ");
        for (int i = 2; i < 10; i++) {
            nextFibonachiValue = firstValue + secondValue;
            System.out.print(nextFibonachiValue + " ");
            firstValue = secondValue;
            secondValue = nextFibonachiValue;
        }
        System.out.println();
        System.out.println("-----------------------");













    }
}
