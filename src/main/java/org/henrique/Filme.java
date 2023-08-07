package org.henrique;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int duracaoMinutos;
    private int numeroDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }


    public void exibirFilme() {
        System.out.println("Nome: " + nome + " Número de Avaliações: " + numeroDeAvaliacoes + " Duração: " + duracaoMinutos);
    }

    public void avaliarFilme(double nota) {
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    public double pegarMedias() {
        return avaliacao/numeroDeAvaliacoes;
    }


}
