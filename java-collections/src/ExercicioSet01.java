import java.util.*;

public class ExercicioSet01 {

    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList(
                "vermelho",
                "laranja",
                "amarelo",
                "verde",
                "azul",
                "anil",
                "violeta"
        )
        );

        System.out.printf("As %d cores do arco-iris em ordem são:\n", cores.size());
        for (String s : cores)
            System.out.println(s);

        System.out.println("\n<<=========>>\n");
        System.out.println("Cores do arco-iris em ordem alfabetica:");
        Set<String> coresOrdenadas = new TreeSet<>(cores);
        System.out.println(coresOrdenadas);

        System.out.println("\n<<=========>>\n");
        System.out.println("Cores do arco-iris em ordem inversa:");
        List<String> coresReversas = new ArrayList<>(cores);
        Collections.reverse(coresReversas);
        System.out.println(coresReversas);

        System.out.println("\n<<=========>>\n");
        System.out.println("Cores do arco-iris que começam com 'v':");
        for (String cor : cores)
            if(cor.startsWith("v"))
                System.out.println(cor);

        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v"))
                iterator.remove();
        }
        System.out.printf("\nApós remoçao das cores que não começam em 'v', ficam %d cores:\n", cores.size());

        System.out.println("\n<<=========>>\n");
        cores.clear();
        if (cores.isEmpty())
            System.out.println("Limpeza da lista efetuada com sucesso!");
    }
}
