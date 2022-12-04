/**
 * 4*. (Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:

Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой

Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */

package HW3;

import java.util.ArrayList;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arrA.add(rnd.nextInt(10));
        }
        for (int i = 0; i < 9; i++) {
            arrB.add(rnd.nextInt(10));
        }

        ArrayList<Integer> a_b = new ArrayList<>();
        ArrayList<Integer> b_a = new ArrayList<>();
        ArrayList<Integer> aAb = new ArrayList<>();

        for (int i = 0; i < arrA.size(); i++) {
            if (arrB.contains(arrA.get(i)) == false && a_b.contains(arrA.get(i)) == false) {
                a_b.add(arrA.get(i));
            }
        }
        for (int i = 0; i < arrB.size(); i++) {
            if (arrA.contains(arrB.get(i)) == false && b_a.contains(arrB.get(i)) == false) {
                b_a.add(arrB.get(i));
            }
        }
        for (int i = 0; i < a_b.size(); i++) {
            aAb.add(a_b.get(i));
        }
        for (int i = 0; i < b_a.size(); i++) {
            aAb.add(b_a.get(i));
        }

        System.out.println(arrA + "\n" + arrB + "\n" + a_b + "\n" + b_a + "\n" + aAb);
    }
}
