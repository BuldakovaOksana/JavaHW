package HW2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) throws IOException {

        // to read from the file
        FileInputStream inFile = new FileInputStream("Task2_3.txt");
        byte[] string = new byte[inFile.available()];
        inFile.read(string);
        String newText = new String(string);
        inFile.close();
        String str = newText.replace("{", "").replace("}", "").replace("\"", "");
        String[] str2 = str.split(", ");
        System.out.println(Arrays.toString(str2));

        Map<String, String> dictionary = new HashMap<String, String>();

        for (String item : str2) {
            String[] strNew = item.split(", ");
            for (String item2 : strNew) {
                String[] strNew2 = item2.split(",");
                for (String item3 : strNew2) {
                    String[] strNew3 = item3.split(":");
                    dictionary.put(strNew3[0], strNew3[1]);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Студент " + dictionary.get("фамилия") + " получил " + dictionary.get("оценка")
                        + " по предмету " + dictionary.get("предмет"));
                System.out.println(sb);
            }
        }
    }
}

