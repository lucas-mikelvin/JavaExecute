package mikelvin.projeto.ac3.modelos;

public class Astralis extends Organizacao {

    public Astralis(String nome, String pais, Integer vitorias, Integer derrotas, String mapaPreferido, String mapaOdiado) {
        super(nome, pais, vitorias, derrotas, mapaPreferido, mapaOdiado);
    }

    @Override
    public String preparamentoMajor() {
        String preparacao = "Com cada jogador jogando de forma remota, Astralis volta aos treinos nos campeonatos europeus!";
        return preparacao;
    }

 

    
}
