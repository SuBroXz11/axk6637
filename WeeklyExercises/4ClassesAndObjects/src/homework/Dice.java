package homework;

import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many sides does die 1 have? ");
        int dieOne = scan.nextInt();

        System.out.print("How many sides does die 2 have? ");
        int dieTwo = scan.nextInt();

        int firstRoll = (int)(Math.random() * dieOne) + 1; // Adding 1 to include the upper bound
        int secondRoll = (int)(Math.random() * dieTwo) + 1;

        int firstRoll2 = (int)(Math.random() * dieOne) + 1;
        int secondRoll2 = (int)(Math.random() * dieTwo) + 1;

        int firstRoll3 = (int)(Math.random() * dieOne) + 1;
        int secondRoll3 = (int)(Math.random() * dieTwo) + 1;

        System.out.printf("Die 1 first roll = %d%n", firstRoll);
        System.out.printf("Die 2 first roll = %d%n", secondRoll);
        System.out.printf("Die 1 second roll = %d%n", firstRoll2);
        System.out.printf("Die 2 second roll = %d%n", secondRoll2);
        System.out.printf("Die 1 third roll = %d%n", firstRoll3);
        System.out.printf("Die 2 third roll = %d%n", secondRoll3);
        
        int dieOneRoll = firstRoll + firstRoll2 + firstRoll3; 
        int dieTwoRoll = secondRoll + secondRoll2 + secondRoll3;
        double dieOneAvg= (double)dieOneRoll / 3;
        double dieTwoAvg= (double)dieTwoRoll / 3;
        String AvgOne=String.format("%.3f", dieOneAvg);
        String AvgTwo=String.format("%.3f", dieTwoAvg);
        
        System.out.printf("Die 1 rolled a total of " + dieOneRoll + " and rolled  " + AvgOne + " on average \n");
        System.out.printf("Die 2 rolled a total of " + dieTwoRoll + " and rolled  " + AvgTwo + " on average");
        
        

        scan.close();
    }
}

