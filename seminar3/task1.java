/**
 * Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.

 */


package seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void run() {
        Random rand = new Random();

        List<Integer> intList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(15));

        }
        intList.sort(null);;
        System.out.println(intList.toString());
    }
    
    // public class IntegerComparator implements Comparator<Integer>{
    //     @Override
    // }
    public static void main(String[] args) {
        run();
    }
}
