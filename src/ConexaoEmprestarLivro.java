import java.sql.*;

public class ConexaoEmprestarLivro {
    static Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/ProjetoFinal";
    String user = "root";
    String password = "password";

    public ConexaoEmprestarLivro() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexão: " + e.getMessage());
        }
    }

    public static Connection getConexao() {
        return connection;
    }
}