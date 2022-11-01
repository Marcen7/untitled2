package org.example;

import java.util.Scanner;

public class SwichIntro {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 1 do 3");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Znam ta liczbę podałeś liczbe 1");
                break;
            case 2:
                System.out.println("Znam tą liczbę podałeś liczbę 2");
                break;
            case 3:
                System.out.println("Znam tą liczbe podałeś licbę \r\n 3 ");
        }
    }
}
