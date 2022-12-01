/**
 * Напишите метод, который сжимает строку. 
   Пример: aaaabbbcdd → a4b3cd2

 */

package seminar2;

public class task2 {
    public static void main(String[] args) {
        System.out.println(compressStr("aaaaagggggjkkkk"));
    }

    /**
     * @param str
     * @return
     */
    public static String compressStr(String str) {
        int count = 1;
        int i = 0;
        StringBuilder result = new StringBuilder();
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;

            } else {
                if (count > 1) {
                    result.append(str.charAt(i));
                    result.append(count);
                    count = 1;
                } else {
                    result.append(str.charAt(i));
                }
            }

        }
        if (count > 1) {
            result.append(str.charAt(i));
            result.append(count);

        } else {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
