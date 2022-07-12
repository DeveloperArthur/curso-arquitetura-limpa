package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.MatricularAlunoDto;
import br.com.alura.escola.infraestrutura.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularAlunoPelaCLI {
    public static void main(String[] args) {
        String nome = "Fulano Silva";
        String cpf = "123";
        String email = "fluano@jdhsj";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunoEmMemoria());
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));
    }
}
