package gerenciadorAlunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void addAluno(String nome, long matricula, double media){
        Alunos alunoTemp = new Alunos(nome, matricula, media); //Criação de um objeto temporário para verificação
        if(alunosSet.contains(alunoTemp)){
            throw new IllegalArgumentException("Aluno(a) " + nome + ", matricula ja existente, tente outra");
        }
        else {
            this.alunosSet.add(alunoTemp);
            System.out.println("Aluno(a) '" + nome + "' com matricula '" + matricula + "' adicionado");
        }
    }

    public void removerAluno(long matricula){
        Alunos alunosParaRemover = null;
        for(Alunos a : alunosSet){
            if(a.getMatricula() == matricula){
                alunosParaRemover = a;
                break;
            }
        }
        if(alunosParaRemover == null){
            throw new IllegalArgumentException("Matricula nao encontrada");
        }
        else{
            alunosSet.remove(alunosParaRemover);
            System.out.println("Aluno(a) '" + alunosParaRemover.getNome() + "' com a matricula '" + alunosParaRemover.getMatricula() + "' removido");
        }
    }

    public void exibirAlunosPorMedia(){
        //TreeSet deixa organizado, diferente do HashSet - Organizando por media
        Set<Alunos> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        //Preenchendo para que possa ser organizado
        alunosPorMedia.addAll(alunosSet);
        System.out.println(alunosPorMedia);
    }

    public void exibirAlunosPorNome(){
        //TreeSet para orgaanizar
        Set<Alunos> alunosPorNome = new TreeSet<>(new ComparatorPorNome());
        //Preenchendo
        alunosPorNome.addAll(alunosSet);
        System.out.println(alunosPorNome);
    }

}

class ComparatorPorNome implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}
