/*
Вычислить код символа в кодировке ASCII
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        char symbol = sc.nextLine().charAt(0);
        System.out.println("Ваш символ: " + symbol + "\nКод символа ASCII: " + (int) symbol);
    }
}
