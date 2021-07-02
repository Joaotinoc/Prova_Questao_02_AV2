package com.br.provas.semestre1.av2.qst2;

public class MainPrototipo {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("João","123456789-13","19/11/1990");
        System.out.println(pessoaFisica);

        Prototipo copia = pessoaFisica.clonar();
        System.out.println(copia);
    }
}
