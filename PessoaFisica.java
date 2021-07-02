package com.br.provas.semestre1.av2.qst2;

public class PessoaFisica extends PessoaFisicaPrototConcre {

    public PessoaFisica(String nome, String cpf, String dataNasc){
        super(nome,cpf,dataNasc);
    }

    public PessoaFisica(PessoaFisica clone){
        super(clone);
    }

    @Override
    public Prototipo clonar() {
        return new PessoaFisica(this);
    }

    @Override
    public String toString() {
        return "PessoaFisica{ " + super.toString() + " }";
    }
}
