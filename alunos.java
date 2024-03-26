import java.util.ArrayList;
import java.util.List;

public class Alunos {
    private List<String> nomes;

    public Alunos() {
        nomes = new ArrayList<>();
        // Adicionando nomes de alunos à lista
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Lucas");
        nomes.add("Juliana");
        nomes.add("Carlos");
        nomes.add("Mariana");
        nomes.add("Rafael");
        nomes.add("Fernanda");
        nomes.add("Diego");
        nomes.add("Larissa");
        nomes.add("Gustavo");
        nomes.add("Amanda");
        nomes.add("Felipe");
    }

    public List<String> getNomes() {
        return nomes;
    }

    public static void main(String[] args) {
        Alunos alunos = new Alunos();
        List<String> listaDeNomes = alunos.getNomes();
        // Exibindo os nomes dos alunos
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}
