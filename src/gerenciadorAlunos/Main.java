package gerenciadorAlunos;

public class Main {
    public static void main(String[] args){
        GerenciadorAlunos alunos = new GerenciadorAlunos();
        try{
            alunos.addAluno("Joao", 951753, 5.5);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            alunos.addAluno("Maria", 951753, 5.8); //Matrícula duplicada
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            alunos.addAluno("Heloisa", 369852, 8.7);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            alunos.addAluno("Ana", 325698, 10.0);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            alunos.addAluno("Bruno", 147852, 8.5);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
           alunos.addAluno("Gabriel",852654, 4.9);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("ALUNOS POR NOME, EM ORDEM ALFABETICA: ");
        alunos.exibirAlunosPorNome();
        System.out.println();

        System.out.println("ALUNOS POR MEDIA, DA MAIOR PARA A MENOR: ");
        alunos.exibirAlunosPorMedia();
        System.out.println();

        alunos.removerAluno(852654);
        System.out.println();
        System.out.println("ALUNOS POR MEDIA, DA MAIOR PARA A MENOR: ");
        alunos.exibirAlunosPorMedia();
    }
}
