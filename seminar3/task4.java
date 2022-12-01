/**
 * Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
 * что на 0-й позиции каждого внутреннего списка содержится название жанра, 
 * а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
 */

package seminar3;

import java.util.ArrayList;

public class task4 {
    public static void run(String[] args) {
        ArrayList<ArrayList<String>> bookStore = new ArrayList<>();
        ArrayList<String> action = new ArrayList<>();
        ArrayList<String> fantasy = new ArrayList<>();

        action.add("Экш");
        action.add("тмя");
        action.add("ооо");

        fantasy.add("Фантастика");
        fantasy.add("Фантастика ffff");
        fantasy.add("fff Фантастика");

        bookStore.add(action);
        bookStore.add(fantasy);
        System.out.println(bookStore);
    }
    public static void main(String[] args) {
        run(args);
    }
}
