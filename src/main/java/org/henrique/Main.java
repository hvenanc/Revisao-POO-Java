package org.henrique;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("007");
        filme.setAnoDeLancamento(2015);
        filme.setAvaliacao(4.5);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoMinutos(180);

        filme.avaliarFilme(9.5);
        filme.avaliarFilme(8);
        filme.avaliarFilme(6.7);
        double media = filme.pegarMedias();
        filme.exibirFilme();
        System.out.println("Avaliações: " + filme.getNumeroDeAvaliacoes());
        System.out.println("Media = " + media);
    }
}