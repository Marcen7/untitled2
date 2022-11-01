package org.example;

import java.util.Scanner;

public class ExLoop {
    public static void main(String[] args) {


        int sauNum =0 ;
        int check = 0;

        for (int i = 1; i <= 1000 ; i++) {
            sauNum = sauNum + 1;
            check = check+i;

            System.out.println(sauNum);

            //System.out.println(check);
        }
        System.out.println("Suma = " + check);


    }
}
