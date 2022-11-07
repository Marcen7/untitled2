package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Wybierz typ działania który chcesz przeprowadzić:" + "\n" +
                "DODAWANIE - wciśniej: 1 " + "\n" +
                "ODEJMOWANIE - wciśnij: 2 " + "\n" +
                "MNOŻENIE - wciśniej: 3 " + "\n" +
                "DZIELENIE - wciśnij: 4 ");


    Scanner scanner = new Scanner(System.in);
    int choos = scanner.nextInt();


        switch (choos){
        case 1:
            System.out.println(addNumber());
            break;

        case 2:
            System.out.println(subtractNumber());
            break;

        case 3:
            System.out.println(multiplyNumber());
            break;

        case 4:
            System.out.println(divideNumber());
            break;

        default:
            System.out.println("Wybór poza zakresem");
    }}


    public static int getNumber() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static int addNumber() {
        int a = getNumber();
        int b = getNumber();
        int sum = a + b;
        return sum;

    }

    public static int subtractNumber() {
        int a = getNumber();
        int b = getNumber();
        int sum = a - b;
        return sum;

    }

    public static int multiplyNumber() {
        int a = getNumber();
        int b = getNumber();
        int sum = a*b;
        return sum;

    }

    public static int divideNumber() {
        int a = getNumber();
        int b = getNumber();
        int sum = a/b;
        return sum;
    }
}