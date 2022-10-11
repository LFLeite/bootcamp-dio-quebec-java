package exerciciosSet;

import java.util.*;

public class ExercicioSet02 {

    public static void main(String[] args) {
        Set<LinguagemFavorita> setLinguagens = new LinkedHashSet<>();
        setLinguagens.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        setLinguagens.add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
        setLinguagens.add(new LinguagemFavorita("JavaScript", 1995, "VS Code"));

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordem de inserção:");
        for (LinguagemFavorita linguagem : setLinguagens)
            System.out.println(linguagem);

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordem natural (nome):");
        Set<LinguagemFavorita> setNatural = new TreeSet<>(setLinguagens);
        for (LinguagemFavorita linguagem : setNatural)
            System.out.println(linguagem);

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordenação por IDE:");
        Set<LinguagemFavorita> setIDE = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        setIDE.addAll(setLinguagens);
        for (LinguagemFavorita linguagem : setIDE)
            System.out.println(linguagem);

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordenação por ano de criação e nome:");
        Set<LinguagemFavorita> setAnoNome = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
        setAnoNome.addAll(setLinguagens);
        for (LinguagemFavorita linguagem : setAnoNome)
            System.out.println(linguagem);

        System.out.println("\n<<=========>>\n");
        System.out.println("Ordenação por nome, ano de criação e IDE:");
        Set<LinguagemFavorita> setNomeAnoIDE = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIDE());
        setNomeAnoIDE.addAll(setLinguagens);
        for (LinguagemFavorita linguagem : setNomeAnoIDE)
            System.out.println(linguagem);
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.nome.compareTo(linguagem.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);

        if (anoDeCriacao != 0)
            return anoDeCriacao;
        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);

        if (nome != 0)
            return nome;

        if (anoDeCriacao != 0)
            return anoDeCriacao;

        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}