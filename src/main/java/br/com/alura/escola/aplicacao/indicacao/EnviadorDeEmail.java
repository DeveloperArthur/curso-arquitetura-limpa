package br.com.alura.escola.aplicacao.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;

public interface EnviadorDeEmail {
    void enviarPara(Aluno indicado);
}
