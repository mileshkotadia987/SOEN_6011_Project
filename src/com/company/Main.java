package com.company;

import java.util.Scanner;

/**
 * Main class
 * @author MILESH
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc;
        HyperbolicSineFunction sineFunction =new HyperbolicSineFunction();
        System.out.println("---------- Sinh(x) Calculator -----------");
        System.out.print("Enter the value of x (numbers only): ");
        sc=new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double input = sc.nextDouble();
            sineFunction.SinhComputation(input);
        }
        else{
            System.out.println("The user input is not in proper format!!");
//            sc.close();
        }
        while(true){
            System.out.print("Do you want to continue(yes/no): ");
            sc=new Scanner(System.in);
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("yes")){
                System.out.print("Enter the value of x: ");
                if (sc.hasNextDouble()) {
                    double input = sc.nextDouble();
                    sineFunction.SinhComputation(input);
                }
                else{
                    System.out.println("The user input is not in proper format!!");
                }
            }
            else if (userChoice.equalsIgnoreCase("no")){
                System.out.println("Thank you!!");
                System.exit(0);
            }
            else{
                System.out.println("Please select a valid option!!");
            }
        }
    }
}
