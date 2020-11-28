package mikelvin.projeto.ac3.modelos;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexao {

    private BasicDataSource dataSource;

    public Conexao() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://18.206.156.48:3306/timecs?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
