package escola;

import br.com.alura.escola.aplicacao.aluno.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infraestrutura.aluno.RepositorioDeAlunoEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMatricularAluno {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunoEmMemoria();

        MatricularAluno useCase = new MatricularAluno(repositorioDeAlunos);

        String nome = "Fulano Silva";
        String cpf = "123";
        String email = "fluano@jdhsj";

        useCase.executa(new MatricularAlunoDto(nome, cpf, email));

        Aluno aluno = repositorioDeAlunos
                .buscarPorCPF(new CPF(cpf));

        assertEquals("Fulano Silva", aluno.getNome());
        assertEquals("123", aluno.getCpf());
    }
}
