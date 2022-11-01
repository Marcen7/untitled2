package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe ");
        int firstNumber = sc.nextInt();


        System.out.println("Podaj drug liczbe ");
        int secoudNumber = sc.nextInt();

        if (firstNumber > secoudNumber){
            System.out.println("Pierwsza liczba jest większa od drugiej");}
            else if (secoudNumber > firstNumber) {
                System.out.println("Druga liczba jest wieksza od pierwszej");
            }
            else {
                System.out.println("Liczby są równe");
            }
        }

    }
