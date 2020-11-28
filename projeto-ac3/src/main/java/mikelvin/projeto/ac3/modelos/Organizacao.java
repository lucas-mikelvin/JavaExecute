package mikelvin.projeto.ac3.modelos;

public abstract class Organizacao {

    protected String nome;
    protected String pais;
    protected Integer vitorias;
    protected Integer derrotas;
    protected String mapaPreferido;
    protected String mapaOdiado;
    protected String dataFund;
    protected static final String JOGO = "Counter strike global offensive";

    public static String gritar() {
        String treino = "CS não é só mira!";
        return treino;
    }

    public static String getJogoEletronico() {
        return JOGO;
    }

    public void setDataFund(String dataFund) {
        this.dataFund = dataFund;
    }

    public String getDataFund() {
        return dataFund;
    }

    public Organizacao(String nome, String pais, Integer vitorias, Integer derrotas, String mapaPreferido, String mapaOdiado) {
        this.nome = nome;
        this.pais = pais;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.mapaPreferido = mapaPreferido;
        this.mapaOdiado = mapaOdiado;
    }

    public abstract String preparamentoMajor();

    public String getMapaOdiado() {
        return mapaOdiado;
    }

    public void setMapaOdiado(String mapaOdiado) {
        this.mapaOdiado = mapaOdiado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public String getMapaPreferido() {
        return mapaPreferido;
    }

    public void setMapaPreferido(String mapaPreferido) {
        this.mapaPreferido = mapaPreferido;
    }

    public String getNome() {
        return nome;
    }
}
