
/**
 * В файле содержится строка с данными:

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
package HW2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task2_3 {
    public static String getLineOffile(String fileName) {
        String strOffile = null;
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            strOffile = reader.readLine();

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return strOffile;
    }

    private static String[][] jsnparsetoarray(String jsnstr) {
        String line = jsnstr.substring(1, jsnstr.length() - 1);

        String[] jsnarray = line.split(", ");

        String[][] jsnarrayofBase = new String[jsnarray.length][3];
        for (int i = 0; i < jsnarray.length; i++) {
            line = jsnarray[i].substring(1, jsnarray[i].length() - 1);
            for (int j = 0; j < 3; j++) {
                String[] minJsnarray = line.split(",");
                String[] microJsnarray = minJsnarray[j].split(":");
                jsnarrayofBase[i][j] = microJsnarray[1].substring(1, microJsnarray[1].length() - 1);

            }
        }
        return jsnarrayofBase;
    }

    private static String[] gluing_strings(String[][] arraystr) {
        String[] gluing_str = new String[arraystr.length];
        StringBuilder Newstr = new StringBuilder();
        for (int i = 0; i < arraystr.length; i++) {
            Newstr.append("Студент ");
            Newstr.append(arraystr[i][0]);
            Newstr.append(" получил  ");
            Newstr.append(arraystr[i][1]);
            Newstr.append(" по предмету ");
            Newstr.append(arraystr[i][2]);
            gluing_str[i] = Newstr.toString();
            Newstr.delete(0, Newstr.length());
        }
        return gluing_str;
    }

    public static void main(String[] args) {
        String strjsn_offile = getLineOffile("text2.jsn");
        System.out.println(strjsn_offile);
        String[] array = gluing_strings(jsnparsetoarray(strjsn_offile));
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}