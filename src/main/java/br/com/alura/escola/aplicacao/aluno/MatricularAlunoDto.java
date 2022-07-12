package br.com.alura.escola.aplicacao.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDto {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno(){
        return new FabricaDeAluno()
                .comNomeCPFEmail(
                        nomeAluno,
                        cpfAluno,
                        emailAluno)
                .criar();
    }
}
