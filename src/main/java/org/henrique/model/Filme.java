package org.henrique.model;

import org.henrique.calculadora.Classificavel;

public class Filme extends Tituto implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegarMedias()/2);
    }
}
