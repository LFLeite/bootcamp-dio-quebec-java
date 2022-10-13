package dio.java.exercises.list;

import java.util.*;

public class ExercicioList01 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> monthList = Arrays.asList(
            "1 - janeiro : ",
            "2 - fevereiro : ",
            "3 - março : ",
            "4 - abril : ",
            "5 - maio : ",
            "6 - junho : "
    );

    public static void main(String[] args) {
        List<Double> temperatureList = new ArrayList<Double>();

        for (String s : monthList) {
            System.out.printf("Digite a temperatura no mês %s", s);
            temperatureList.add(scanner.nextDouble());
        }

        Double average = temperatureList.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("\n<<=========>>\n");
        compareTemperatures(temperatureList, average);
    }

    private static void compareTemperatures(List<Double> temperatureList, Double averageTemperature) {
        System.out.printf("Meses com temperatura acima da média de %.1f ºC:\n", averageTemperature);

        for (int i=0; i<6; i++) {
            Double currentTemperature = temperatureList.get(i);

            if (currentTemperature > averageTemperature)
                System.out.printf(monthList.get(i) + "%.1f ºC\n", currentTemperature);
        }

    }
}
