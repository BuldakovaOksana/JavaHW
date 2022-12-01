/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
    Вывести название каждой планеты и количество его повторений в списке.

 */
package seminar3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void run(){
        String[] planetsName = new String[]{"Земля", "Меркурий", "Венера", "Марс", "Юпитер","Сатурн","Нептун","Уран"};
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> repeetPlanetsName = new ArrayList<>(16);
        for (int i = 0; i < 16; i++) {
            repeetPlanetsName.add(planetsName[rand.nextInt(7)]);
        }
        
        for (int i = 0; i < planetsName.length; i++) {
            int count = 0;
            for (int j = 0; j < planetsName.length; j++) {
                if (planetsName[i].equals(repeetPlanetsName.get(j))) {
                    count++;
                }
                
            }
            sb.append(planetsName[i]);
                sb.append("=");
                sb.append(count);
                sb.append(" ");
        }
        System.out.println(repeetPlanetsName.toString());
        System.out.println(sb);
        
    }

    

    
    public static void main(String[] args) {
        run();
    }
}
