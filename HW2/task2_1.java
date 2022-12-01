package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * В файле содержится строка с исходными данными в такой форме:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Требуется на её основе построить и вывести на экран новую строку, в форме SQL
 * запроса:
 * SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city
 * = "Moscow";
 */

public class task2_1 {

  public static String reader() {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("Txt1.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line).append(System.lineSeparator());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    String str = sb.toString();
    return str;

  }

  public static void split(String str) {
    String str2 = str.replace("{", "")
        .replace("}", "")
        .replace("\"", "");
    String[] newStr = str2.split(", ");

    Map<String, String> dictionary = new HashMap<String, String>();
    for (String item : newStr) {
      String[] strnew = item.split(":");
      System.out.println(Arrays.toString(strnew));
      for (int i = 0; i < newStr.length; i++) {
        dictionary.put(strnew[0], strnew[1]);

      }
    }
    System.out.println(dictionary.entrySet());
    StringBuilder WHERE = new StringBuilder();
    Set<Map.Entry<String, String>> pair = dictionary.entrySet();
    List<Map.Entry<String, String>> list = new ArrayList<>(pair);
    for (int i = 0; i < list.size(); i++) {
      if (!list.get(i).getValue().equals("null")) {
        WHERE.append(list.get(i).getKey() + " = " + list.get(i).getValue() + " and ");
        
      }
    }
    System.out.println(WHERE);

  }

  public static void main(String[] args) {

    split(reader());

  }
}
