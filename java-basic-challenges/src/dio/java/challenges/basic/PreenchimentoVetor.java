package dio.java.challenges.basic;

import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int value = 0;

        for (int i = 0; i < 1000; i++) {
            if (value >= t)
                value = 0;

            System.out.println("N[" + i + "] = "+ value++);
        }
    }
}
