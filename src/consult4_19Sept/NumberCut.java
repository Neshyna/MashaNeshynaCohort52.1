package consult4_19Sept;

import java.util.Random;

public class NumberCut {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10_000_000);
        System.out.println(rand);

        int sum = 0;

        while (rand > 0) {
            int digit = rand % 10;
            rand /= 10;
            sum += digit;

            System.out.print(digit);

            if (rand > 0) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }

        }

        System.out.println(sum);

    }
}
