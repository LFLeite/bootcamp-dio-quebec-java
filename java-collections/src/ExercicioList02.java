import java.util.*;

public class ExercicioList02 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> questionList = Arrays.asList(
            "Telefonou para a vítima? ",
            "Esteve no local do crime? ",
            "Mora perto da vítima? ",
            "Devia para a vítima? ",
            "Já trabalhou com a vítima? "
    );


    public static void main(String[] args) {
        int positiveAnswers = 0;

        for (String question : questionList) {
            if (askQuestion(question))
                positiveAnswers++;
        }

        System.out.println("\n<<=========>>\n");
        System.out.println("Classificação: " + verdict(positiveAnswers));
    }

    private static boolean askQuestion(String question) {
        System.out.printf(question);
        String answer = scanner.next();

        return answer.toLowerCase().contains("sim");
    }

    private static String verdict(int positiveAnswers) {
        return switch (positiveAnswers) {
            case 2 -> "SUSPEITO";
            case 3, 4 -> "CUMPLICE";
            case 5 -> "ASSASSINO";
            default -> "INOCENTE";
        };
    }
}