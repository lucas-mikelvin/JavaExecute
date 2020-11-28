package mikelvin.projeto.ac3.modelos;

public class Mibr extends Organizacao {
  
    public Mibr(String nome, String pais, Integer vitorias, Integer derrotas, String mapaPreferido, String mapaOdiado) {
        super(nome, pais, vitorias, derrotas, mapaPreferido, mapaOdiado);
    }

    @Override
    public String preparamentoMajor() {
        String preparacao = "Com muitas decepções, o time conquistou poucos pontos qualificatórios e estará fora desta edição!";
        return preparacao;
    }
 
    
}
