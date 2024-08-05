package gerenciadorAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    //atributos
    private String nome;
    private final long matricula;
    private double media;

    //construtor
    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    //faz a comparaçao por nome do aluno, em ordem alfabetica
    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Alunos: " +
                "nome= '" + nome + '\'' +
                ", matricula= " + matricula +
                ", media= " + media +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}

//fazendo a comparação dos alunos pela media, da mais alta até a mais baixa
class ComparatorPorMedia implements Comparator<Alunos>{
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a2.getMedia(), a1.getMedia());
    }


}