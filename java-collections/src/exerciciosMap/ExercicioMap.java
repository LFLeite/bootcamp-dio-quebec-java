package exerciciosMap;

import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> populationMap = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3354265);
        }};

        // Substituição do valor na chave 'RN' para 3.534.165
        populationMap.put("RN", 3534165);

        // Se não houver valor para 'PB', adicionar população de 4.039.277
        if (!populationMap.containsKey("PB"))
            populationMap.put("PB", 4039277);

        System.out.println("População do PE: " + populationMap.get("PE"));

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordem de inserção:");
        System.out.println(populationMap);


        System.out.println("\n<<=========>>\n");
        Map<String, Integer> populationMapByName = new TreeMap<>(populationMap);
        System.out.println("Ordem de alfabética:");
        System.out.println(populationMapByName);

        System.out.println("\n<<=========>>\n");
        String minKey = Collections.min(populationMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        String maxKey = Collections.max(populationMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        int sum = populationMap.values().stream().mapToInt(Integer::intValue).sum();

        System.out.printf("Estado com a menor população: %s - %d\n", minKey, populationMap.get(minKey));
        System.out.printf("Estado com a maior população: %s - %d\n", maxKey, populationMap.get(maxKey));
        System.out.printf("População total: %d (média de %.2f por estado)\n", sum, sum/(double)populationMap.size());


        System.out.println("\n<<=========>>\n");
        Iterator<Integer> iterator = populationMap.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= 4000000)
                iterator.remove();
        }
        System.out.println("Estados com população superior a 4000000:");
        System.out.println(populationMap);

        System.out.println("\n<<=========>>\n");
        populationMap.clear();
        if (populationMap.isEmpty())
            System.out.println("Limpeza da lista efetuada com sucesso!");
    }
}
