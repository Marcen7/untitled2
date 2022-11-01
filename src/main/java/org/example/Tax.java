package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxToPay;
        System.out.println("Podaj dochód");
        int tax = scanner.nextInt();

        if( tax <= 100){
            taxToPay = tax * 0.2;
            }
        else if (tax <= 100000) {
            taxToPay = (100 * 0.2) + ((tax - 100)*0.3) ;
        }
        else {
            taxToPay = tax * 0.4;
        }
        System.out.println("Podatek do zapłaty = " + taxToPay);
    }



}
