package com.br.provas.semestre1.av2.qst2;

public abstract class PessoaFisicaPrototConcre implements Prototipo {

    private String nome;
    private String cpf;
    private String dataNasc;

    public PessoaFisicaPrototConcre(String nome, String cpf, String dataNasc){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public PessoaFisicaPrototConcre(PessoaFisicaPrototConcre clone) {
        this.nome = clone.nome;
        this.cpf = clone.cpf;
        this.dataNasc = clone.dataNasc;
    }

    @Override
    public String toString() {
        return "CirculoPrototConcre{" +
                "x=" + nome +
                ", y=" + cpf +
                ", raio=" + dataNasc +
                '}';
    }
}
