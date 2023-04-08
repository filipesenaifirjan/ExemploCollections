import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Aluno {
        int matricula;
          String nome;
          int idade;

    Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
     }
}



class ComparadorIdade implements Comparator<Aluno> {
    public int compare(Aluno a1, Aluno a2) {
         return Integer.compare(a1.idade, a2.idade);
    }
}

class ComparadorNome implements Comparator<Aluno> {
    public int compare(Aluno a1, Aluno a2) {
         return a1.nome.compareTo(a2.nome);
    }
}

class Ex7 {
  public static void main(String args[]) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno(101, "Filipe", 40));
        listaAlunos.add(new Aluno(106, "Junior", 47));
        listaAlunos.add(new Aluno(105, "Eric", 24));
               System.out.println("Ordenando por Nome...");


        Collections.sort(listaAlunos, new ComparadorNome());
        for (Aluno aluno : listaAlunos) {
        System.out.println(aluno.matricula + " " + aluno.nome + " " + aluno.idade);      }

        System.out.println("Ordenando por Idade...");

        Collections.sort(listaAlunos, new ComparadorIdade());
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.matricula + " " + aluno.nome + " " + aluno.idade);
        }
    }
}
