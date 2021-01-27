/*
Вычислить код символа в кодировке ASCII
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char symbol = ' ';
        int ascii = 1;
        System.out.println("Введите символ: ");
        if (sc.hasNextLine()) {
            symbol = sc.nextLine().charAt(0);
            ascii = symbol;
        }
        System.out.println("Ваш символ: " + symbol + "\nКод символа ASCII: " + ascii);
    }
}
