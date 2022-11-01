package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExArray_1 {
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
        if (tabelN[i] > tabelN[i+1]) {
            tabelN[i] = tabelN[i + 1];
            tabelN[i + 1] = tabelN[i];
        }
        else {
            tabelN[i] = tabelN[i];
            tabelN[i+1] = tabelN[i+1];
        }

        }
        System.out.println(Arrays.toString(tabelN));

    }}