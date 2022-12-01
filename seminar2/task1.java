/**
 * Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

 */

package seminar2;

public class task1 {
    public static void main(String[] args) {
        System.out.println(getString(10, "#", "*"));

    }

    public static String getString(int n, String c1, String c2) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                str.append(c1);

            } else {
                str.append(c2);
            }

        }
        return str.toString();
    }
}
