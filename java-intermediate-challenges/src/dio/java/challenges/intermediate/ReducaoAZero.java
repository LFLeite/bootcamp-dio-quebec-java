package dio.java.challenges.intermediate;

import java.util.*;

public class ReducaoAZero {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 1)
        {
            if ((num % 2) != 0)
            {
                step++;
                num--;
            }
            step++;
            num /= 2;
        }

        if (num == 1) {
            step++;
            num--;
        }

        System.out.println(step);
    }
}
