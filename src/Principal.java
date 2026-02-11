import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e o Prisioneiro de Askaban");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(140);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos");



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.7);
        meuFilme.avalia(10);
        meuFilme.avalia(9.8);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie brooklyn = new Serie();
        brooklyn.setNome("Brooklyn Nine-Nine");
        brooklyn.setAnoDeLancamento(2010);
        brooklyn.exibeFichaTecnica();
        brooklyn.setTemporadas(7);
        brooklyn.setEpisodiosPortemporada(10);
        brooklyn.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar Brooklyn Nine-Nine: " + brooklyn.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("As Branquelas");
        outroFilme.setAnoDeLancamento(2001);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(brooklyn);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(brooklyn);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);


    }
}
