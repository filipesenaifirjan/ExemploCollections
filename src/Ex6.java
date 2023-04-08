import java.util.*;

class Aluno implements Comparable<Aluno> {
        int matricula;
        String nome;
        int idade;


    Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
      }

    public int compareTo(Aluno aluno) {
        return Integer.compare(idade, aluno.idade);
    }
}

public class Ex6 {
    public static void main(String args[]) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>(Arrays.asList(
                new Aluno(101, "Filipe", 43),
                new Aluno(106, "Alan", 37),
                new Aluno(105, "Jonas", 21)
        ));

        Collections.sort(listaAlunos);

        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.matricula + " " + aluno.nome + " " + aluno.idade);
        }
      }
 }
