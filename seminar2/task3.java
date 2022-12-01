/**
 * Напишите метод, который принимает на вход строку (String)
 *  и определяет является ли строка палиндромом (возвращает boolean значение).
 */

package seminar2;

import java.util.Scanner;

public class task3 {
    public static String scan() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введиту строку для проверки на палиндром ");
        String str = scaner.nextLine();
        return str;

    }

    public static boolean isPolindrom(String str) {
        return (str.equals(new StringBuilder(str).reverse().toString()));
    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(scan()));
    }

}
