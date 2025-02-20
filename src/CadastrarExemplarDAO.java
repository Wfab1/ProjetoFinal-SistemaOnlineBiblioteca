import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class CadastrarExemplarDAO {
    Connection conexao;
    
    public CadastrarExemplarDAO() {
        conexao = new ConexaoExemplar().getConexao();
    }

    //Inserir no banco de dados:
    public void inserirExemplar(CadastrarExemplar cadastrarExemplar) {
        try {
            String sql = "insert into cadastrarexemplar (Codigo, ISBN) values ( ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cadastrarExemplar.getCodigo());
            ps.setString(2, cadastrarExemplar.getIsbn());

            ps.executeUpdate();    //mandando para o banco

            System.out.println("Exemplar inserido com sucesso!");

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }

    //Remover do banco de dados:
    public void remover(String codigo) {
        try {
            String sql = "delete from cadastrarexemplar where Codigo = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, codigo);

            ps.executeUpdate();    //mandando para o banco

            System.out.println("\n Exemplar removido com sucesso");

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);

        }
    }

    //Envinado o código do exemplar:
    public String getCodigo() {
        String codigo = "";
        try {
            String sql = "select * from cadastrarexemplar;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                codigo = rst.getString("Codigo");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return codigo;
    }

    //Verificar código:
    public boolean verificarCodigo(String codigoTeste) {
        boolean Codigo = false;
        try {
            String sql = "select * from cadastrarexemplar where Codigo = ?;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, codigoTeste);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                Codigo = true;
                return Codigo;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return Codigo;
    }

    //ArrayList para exibir os exemplares todos juntos:
    public ArrayList<String> listaExemplares() {
        ArrayList<String> exemplares = new ArrayList<String>();
        try {
            String sql = "select * from cadastrarexemplar;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                String codigo = rst.getString("Codigo");
                String isbn = rst.getString("ISBN");
                exemplares.add("Código: " + codigo);
                exemplares.add("ISBN: " + isbn);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return exemplares;
    }

    //Exibir exemplares:
    public void consultarTudo() {
        try {
            String sql = "select * from cadastrarexemplar;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                String codigo = rst.getString("Codigo");
                String isbn = rst.getString("ISBN");
                JOptionPane.showMessageDialog(null, "\nCódigo: " + codigo + "\nISBN: " + isbn);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }
    
    //Contar quantos exemplares estão cadastrados:
    public int quantidadeExemplaresCadastrados() {
        int quantidadeExemplares = 0;
        try {
            String sql = "select COUNT(*) as quantidadeTotalDeExemplares from cadastrarexemplar";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while(rst.next()){
                quantidadeExemplares = rst.getInt("quantidadeTotalDeExemplares");
                return quantidadeExemplares;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return quantidadeExemplares;
    }
}
