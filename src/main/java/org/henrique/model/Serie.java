package org.henrique.model;

public class Serie extends Tituto {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int duracaoEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(int duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }
    @Override
    public int getDuracaoMinutos() {
        return temporadas * duracaoEpisodio * episodiosPorTemporada;
    }

    @Override
    public void exibirTituto() {
        System.out.println("Nome: " + getNome() + " Número de Avaliações: " + getNumeroDeAvaliacoes() +
                " Temporadas: " + getTemporadas() + " Número de Episódios: " + getEpisodiosPorTemporada());
    }
}
