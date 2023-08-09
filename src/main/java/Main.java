import org.henrique.calculadora.CalculadoraDeTempo;
import org.henrique.calculadora.Recomendacao;
import org.henrique.model.Episodio;
import org.henrique.model.Filme;
import org.henrique.model.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Serie serie = new Serie();

        serie.setNome("The Flash");
        serie.setAtiva(true);
        serie.setTemporadas(9);
        serie.setDuracaoEpisodio(42);
        serie.setDuracaoMinutos(42);
        serie.setAnoDeLancamento(2014);
        serie.setEpisodiosPorTemporada(19);
        serie.avaliarTitulo(8.5);
        serie.avaliarTitulo(10);
        serie.avaliarTitulo(6);

        serie.exibirTituto();

        filme.setNome("O Auto na compadecida");
        filme.setAvaliacao(5);
        filme.avaliarTitulo(10);
        filme.avaliarTitulo(10);
        filme.setDiretor("João");
        filme.setAnoDeLancamento(2000);
        filme.setDuracaoMinutos(135);

        filme.exibirTituto();

        CalculadoraDeTempo tempo = new CalculadoraDeTempo();
        tempo.incluiTitulo(serie);
        tempo.incluiTitulo(filme);

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        Recomendacao filtro = new Recomendacao();
        filtro.filtar(primeiro);
        filtro.filtar(filme);

        System.out.println("O tempo para assistir os conteúdos é de: " + tempo.getTempoTotal() + " horas!");
    }
}