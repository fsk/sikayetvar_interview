package com.frknshnklksz;

import java.util.Scanner;

public class Main {

    private static final int NO_CHOICE = -1;
    private static final int EXIT = 0;

    public static void main(String[] args) {

        int userChoice = NO_CHOICE;

        while (userChoice != EXIT){
            Question1 q1 = new Question1();
            Question3 q3 = new Question3();

            displayMenu();

            userChoice = getUserChoice();
            switch (userChoice){
                case 1:
                    q1.displayQuestion1();
                    q1.question1testCases();
                    q1.question1();
                    break;
                case 2:
                    Question2.displayQuestion2();
                    Question2.displayQuestion2();
                    Question2.question2();
                    break;
                case 3:
                    q3.displayQuestion3();
                    q3.question3testCases();
                    q3.question3();
                    break;
                case EXIT:
                    System.err.print("Program was terminated");
                    return;
                default:
                    System.out.println();
                    System.out.println("Wrong Choice. Try Again.");

            }

        }

    }

    public static void displayMenu() {
        System.out.println();
        System.out.println(Colors.Magenta+"**********************************************************");
        System.out.println(Colors.Magenta+"*    ----------------- QUESTION LIST -----------------   *");
        System.out.println(Colors.Magenta+"*                                                        *");
        System.out.println(Colors.Magenta+"*                   1 - QUESTION 1                       *");
        System.out.println(Colors.Magenta+"*                   2 - QUESTION 2                       *");
        System.out.println(Colors.Magenta+"*                   3 - QUESTION 3                       *");
        System.out.println(Colors.Magenta+"*                   0 - FOR EXIT PRESS                   *");
        System.out.println(Colors.Magenta+"*                                                        *");
        System.out.println(Colors.Magenta+"**********************************************************");
        System.out.println();

        //getUserChoice();
        //return;
    }

    public static int getUserChoice() {
        Scanner data = new Scanner(System.in);
        System.out.print(Colors.Blue+"Please Make Your Choice : ");
        return data.nextInt();
    }
}


//Açıklama Satırları

/**
 *       1) Switch - Case bloğunda çıkış yapılana kadar menü gösterilecek.
 *          Bunun için sonsuz bir while döngüsüne aldım. Çıkış yapılana kadar while dönecek.
 *
 *       2) Sınıflardan nesne türeterek methodları çağırdım. Ama question2 için Question2'deki sınıfları
 *          static tanımladığım için nesne olarak değil de direk sınıf adıyla çağırdım.
 *
 *       3) Colors diye bir sınıf tanımladım ve bu colors sınıfı sayesinde konsolu daha iyi ayırt edebilmeniz
 *          adına renklendirdim.
 *
 *
 */
