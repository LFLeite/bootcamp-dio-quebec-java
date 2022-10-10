import java.util.*;

public class DesafioMap {
    public static void main(String[] args) {
        Map<Integer, Integer> valores = new TreeMap<>();
        Random randomGenerator = new Random();

        for (int i = 0; i < 100; i++) {
            int number = randomGenerator.nextInt(6) + 1;

            if (valores.containsKey(number))
                valores.put(number, valores.get(number) + 1);
            else
                valores.put(number, 1);
        }

        System.out.println("Quantidade de ocorrências por resultado:");
        for (Map.Entry<Integer, Integer> entry : valores.entrySet()) {
            System.out.printf("%d - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
