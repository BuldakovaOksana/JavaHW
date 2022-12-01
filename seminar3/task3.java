/**
 * Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.

 */

package seminar3;

import java.util.ArrayList;

public class task3 {

    public static void run() {
        ArrayList strList = new ArrayList<String>();
        strList.add("lorem");
        strList.add(23);
        strList.add("lorem");
        strList.add(62);
        strList.add("lorem");
        strList.add("lorem");
        strList.add(55);
        strList.add("lorem");
        strList.add(58);
        strList.add("lorem");
        strList.add(56);


        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i) instanceof Integer) {
                strList.remove(i);
                i--;
            }
        }
        System.out.println(strList);
    }

    public static void main(String[] args) {
        run();
    }
}
