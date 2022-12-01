/**
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
    Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

 */

package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task5 {

    private static String[] getstrArr(File f) {
        File[] files = f.listFiles();
        String[] strArr = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            strArr[i] = files[i].toString();
        }
        return strArr;
    }
    // public abstract void writeFile(String[] dir);{
    // try (FileWriter writer = new FileWriter("Txt2.txt", false))
    // {
    // for (int i = 0; i < cdDir.length; i++) {
    // writer.write(dir[i]);
    // }
    // writer.flush();
    // }
    // catch(IOException ex){

    // }

    // }

    public static void main(String[] args) {
        File dir = new File("C:/Users/legion/DesktopJavaHW");
        String[] cdDir = getstrArr(dir);
        try (FileWriter writer = new FileWriter("Txt2.txt", false)) {
            for (int i = 0; i < cdDir.length; i++) {
                writer.write(cdDir[i] + "\n");

            }
            // writer.flush();
        } catch (IOException ex) {
            Logger log = Logger.getLogger("task2");
            log.log(Level.SEVERE, ex.getMessage());
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            Logger log = Logger.getLogger("task2");
            try {
                FileHandler handler = new FileHandler("server.log");
                log.addHandler(handler);
                log.log(Level.SEVERE, ex.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(ex.getMessage());
        }
        // for (int i = 0; i < cdDir.length; i++) {
        // System.out.println(cdDir[i]);
    }

    // Path path = Path.of("C:\\Users\\legion\\Desktop\\JavaHW");

    // try (JavaHW.DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
    // for (Path path : files)
    // System.out.println(path);

    // }
}
