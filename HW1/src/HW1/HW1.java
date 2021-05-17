package HW1;

import javax.swing.*;
import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
    Random ran = new Random();
    Actions[] actions = new Actions[3];


        int distance = ran.nextInt(5);
        int height = ran.nextInt(5);
        actions[0] = new Human("German", distance, height);

        distance = ran.nextInt(10);
         height = ran.nextInt(5);
        actions[1] = new Cat("Barsik", distance, height);

         distance = ran.nextInt(40);
        height = ran.nextInt(40);
        actions[2] = new Robot("Ambrella", distance, height);

        Barrier[] barriers = new Barrier[6];

        boolean istreadmill;
        for (int i = 0; i < barriers.length; i++) {
            distance = ran.nextInt(10);
            istreadmill = ran.nextBoolean();
            if (istreadmill) {
                barriers[i] = new treadmill("Беговая дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {



                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Завершено!!");
            } else {
                System.out.println("Не завершено");
            }
        }
    }
}

