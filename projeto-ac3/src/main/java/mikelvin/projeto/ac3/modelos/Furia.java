package mikelvin.projeto.ac3.modelos;

public class Furia extends Organizacao {

    public Furia(String nome, String pais, Integer vitorias, Integer derrotas, String mapaPreferido, String mapaOdiado) {
        super(nome, pais, vitorias, derrotas, mapaPreferido, mapaOdiado);
    }

    @Override
    public String preparamentoMajor() {
        String preparacao = "Furia está participando de campeonatos na Europa para se acostumar com times de outros continentes!";
        return preparacao;
    }

}
