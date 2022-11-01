package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Określ wielkość tablicy");
        int n = scanner.nextInt();

        int [] tabelN = new int[n];

        for (int i = 0; i < tabelN.length; i++) {
            System.out.println("Podaj wartość komórki nr " + i);
            tabelN[i] = scanner.nextInt();

        }
        for (int i = 0; i < tabelN.length; i++) {
            System.out.println("Element o indeksie " + i + " to " + tabelN[i] );
        }
        System.out.println(Arrays.toString(tabelN));

    }
}
