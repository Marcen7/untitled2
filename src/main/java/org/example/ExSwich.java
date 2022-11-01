package org.example;

import java.util.Scanner;

public class ExSwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie :");
        String name = scanner.nextLine();


        switch (name){
            case "Adam":
                System.out.println("Znam cię Adam");
                break;
            case "Marcin":
                System.out.println("Znam cię Marcin");
                break;
            case "Bartek":
                System.out.println("Znam cię Bartek");
                break;
            default:
                System.out.println("Nieznam cię " + name +", cześć jestem Marcin");
        }

    }
}
