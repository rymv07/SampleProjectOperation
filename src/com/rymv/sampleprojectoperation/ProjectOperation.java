package com.rymv.sampleprojectoperation;

import java.util.Scanner;

public class ProjectOperation {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Sample Program \n");

        loginAuth();

    }

    private static void loginAuth() {

        String userName = "admin";
        String passWord = "pass1234";

        String userInput;
        String passInput;

        boolean userAuth;
        boolean passAuth;

        byte x = 0;
        byte tryX = 5;

        if (x < tryX) {

            System.out.print("Enter Username: ");
            userInput = scan.nextLine();
            System.out.print("Enter Password: ");
            passInput = scan.nextLine();

            userAuth = userInput.equals(userName);
            passAuth = passInput.equals(passWord);

            if (userAuth && passAuth) {
                System.out.println("Access Granted! \n");
                mainMenu();
            } else if (!userAuth || !passAuth) {
                System.out.println("Access Denied! \n");
                x++;

            }
            System.out.println("Tries: " + x);
            loginAuth();
        } else if (x == tryX) {
            System.out.println("\nYou have tried " + x + " times.");
            System.out.println("\n\t Terminating Program...");
            System.exit(0);
            System.out.flush();
        }
    }

    private static byte sizes;

    private static void mainMenu() {
        byte ordernum;

        System.out.println("\t Select your Order: \n");
        System.out.println(" [1] Expresso \n [2] Macchiato \n [3] Regular \n");

        System.out.print("Your Choice: ");
        ordernum = scan.nextByte();

        switch (ordernum) {
            case 1 -> menuExpr();
            case 2 -> menuMachi();
            case 3 -> menuReg();
        }

    }

    private static void menuExpr() {
        float tallExPrice = (float) 150.51;
        float granExPrice = (float) 220.32;
        float ventExPrice = (float) 280.57;

        String tallExp = "Expresso Tall";
        String granExp = "Expresso Grande";
        String ventExp = "Expresso Venti";

        System.out.println("Choose the Size: \n");
        System.out.println(" [1] Tall \n [2] Grande \n [3] Venti \n");

        System.out.print("Your Choice: ");
        sizes = scan.nextByte();
        System.out.println();

        switch (sizes) {
            case 1 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + tallExp + " \t \t " + tallExPrice);
                System.out.println();
                orderAgain();
            }
            case 2 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + granExp + " \t " + granExPrice);
                System.out.println();
                orderAgain();
            }
            case 3 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + ventExp + " \t \t " + ventExPrice);
                System.out.println();
                orderAgain();
            }
        }

    }

    private static void menuMachi() {
        float tallMaPrice = (float) 120.41;
        float granMaPrice = (float) 180.57;
        float ventMaPrice = (float) 230.83;

        String tallMac = "Macchiato Tall";
        String granMac = "Macchiato Grande";
        String ventMac = "Macchiato Venti";

        System.out.println("Choose the Size: \n");
        System.out.println(" [1] Tall \n [2] Grande \n [3] Venti \n");

        System.out.print("Your Choice: ");
        sizes = scan.nextByte();
        System.out.println();

        switch (sizes) {
            case 1 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + tallMac + " \t \t " + tallMaPrice);
                System.out.println();
                orderAgain();
            }
            case 2 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + granMac + " \t " + granMaPrice);
                System.out.println();
                orderAgain();
            }
            case 3 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + ventMac + " \t " + ventMaPrice);
                System.out.println();
                orderAgain();
            }
        }

    }

    private static void menuReg() {
        float tallRePrice = (float) 99.72;
        float granRePrice = (float) 120.29;
        float ventRePrice = (float) 180.43;

        String tallReg = "Regular Tall";
        String granReg = "Regular Grande";
        String ventReg = "Regular Venti";

        System.out.println("Choose the Size: \n");
        System.out.println(" [1] Tall \n [2] Grande \n [3] Venti \n");

        System.out.print("Your Choice: ");
        sizes = scan.nextByte();
        System.out.println();

        switch (sizes) {
            case 1 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + tallReg + " \t \t " + tallRePrice);
                System.out.println();
                orderAgain();
            }
            case 2 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + granReg + " \t \t " + granRePrice);
                System.out.println();
                orderAgain();
            }
            case 3 -> {
                System.out.println("\tOrder \t \t \t \t Price \n" + "\t" + ventReg + " \t \t " + ventRePrice);
                System.out.println();
                orderAgain();
            }
        }

    }

    private static void orderAgain() {
        char ans;

        System.out.print("\n\t Order Again? (Y/N): ");
        ans = scan.next().toUpperCase().charAt(0);

        if (ans == 'Y') {
            mainMenu();
        } else if (ans == 'N') {
            System.out.println("\n\t Terminating Program...");
            System.exit(0);
            System.out.flush();
        }
    }


}
