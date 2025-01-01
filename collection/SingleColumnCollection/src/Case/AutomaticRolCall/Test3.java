package Case.AutomaticRolCall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list, "!", "@", "#", "$", "%");
        int count = list.size();

        Random r = new Random();
        int j = 0;
        while (true) {
            System.out.println("----------------------------------");
            for (int i = 0; i < count; i++) {
                String name = list.remove(r.nextInt(list.size()));
                list1.add(name);
                System.out.println(name);
            }

            list.addAll(list1);
            list1.clear();

            if (++j == 5) {
                break;
            }
        }

    }
}
