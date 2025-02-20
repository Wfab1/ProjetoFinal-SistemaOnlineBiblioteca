import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
        
public class EmprestarLivroDAO {

    Connection conexao;

    public EmprestarLivroDAO() {
        conexao = new ConexaoEmprestarLivro().getConexao();
    }

    //Inserir no banco de dados:
    public void inserirEmprestimo(EmprestarLivro emprestarLivro) {
        try {
            String sql = "insert into emprestarlivro(codigo, nomeUsuario, dataemprestimo, datadevolucao, statusEmprestimo, senha) values ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, emprestarLivro.getCodigo());
            ps.setString(2, emprestarLivro.getNomeUsuario());
            ps.setString(3, emprestarLivro.getDataEmprestimo());
            ps.setString(4, emprestarLivro.getDataDevolucao());
            ps.setString(5, emprestarLivro.getStatusDevolucao());
            ps.setString(6, emprestarLivro.getSenha());

            ps.executeUpdate();    //mandando para o banco

            System.out.println("\n Empréstimo inserido com sucesso!");
            JOptionPane.showMessageDialog(null, "Empréstimo inserido com sucesso!");

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);

        }
    }

    //Devolver livro:
    public void devolverLivro(String codigo) {
        String sql = "update emprestarlivro set statusEmprestimo = 'Concluído' where codigo = ?;";
        try {
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, codigo);
            sttmt.executeUpdate(); //mandando para o banco
            JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!");
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }

    //Remover empréstimo:
    public void remover(String codigoExemplar) {
        try {
            String sql = "delete from emprestarlivro where codigo = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, codigoExemplar);

            ps.executeUpdate();    //mandando para o banco

            System.out.println("\n Empréstimo removido com sucesso");

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);

        }
    }

    //Retornando o código do exemplar emprestado:
    public String getCodigo(String codigoTeste) {
        String codigo = "";
        try {
            String sql = "select * from emprestarlivro where codigo = ?;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, codigoTeste);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                codigo = rst.getString("codigo");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return codigo;
    }
    
    //Retornando a senha do usuário:
    public String getSenha(String senhaTeste) {
        String senha = "";
        try {
            String sql = "select * from emprestarlivro where senha = ?;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, senhaTeste);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                senha = rst.getString("senha");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return senha;
    }
    
    //Exibir os empréstimos:
    public void exibirEmprestimos() {
        try {
            String sql = "select * from emprestarlivro;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();

            while (rst.next()) {
                String codigo = rst.getString("codigo");
                String dataEmpres = rst.getString("dataemprestimo");
                String dataDev = rst.getString("datadevolucao");
                String status = rst.getString("statusEmprestimo");
                String nomeUsuario = rst.getString("nomeUsuario");
                String senha = rst.getString("senha");
                JOptionPane.showMessageDialog(null, "\nCódigo: " + codigo
                        + "\nNome do usuário: " + nomeUsuario
                        + "\nData de empréstimo: " + dataEmpres
                        + "\nData devolução: " + dataDev
                        + "\nStatus do empréstimo: " + status);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }
    
    //ArrayList para exibir todos os empréstimos de uma vez:
    public ArrayList<String> consultarTudoJOptionPane() {
        ArrayList<String> emprestimos = new ArrayList<String>();
        try {
            String sql = "select * from emprestarlivro;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();

            while (rst.next()) {
                String codigo = rst.getString("codigo");
                String dataEmpres = rst.getString("dataemprestimo");
                String dataDev = rst.getString("datadevolucao");
                String status = rst.getString("statusEmprestimo");
                String nomeUsuario = rst.getString("nomeUsuario");
                String senha = rst.getString("senha");
                emprestimos.add("Código: " + codigo);
                emprestimos.add("Nome de Usuário: " + nomeUsuario);
                emprestimos.add("Data de empréstimo: " + dataEmpres);
                emprestimos.add("Data de devolução: " + dataDev);
                emprestimos.add("Status do empréstimo: " + status);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return emprestimos;
    }
    
    //Enviando a data de empréstimo:
    public String getDataEmprestimo() {
        String dataEmprestimo = "";
        try {
            String sql = "select * from emprestarlivro;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            
            dataEmprestimo = rst.getString("dataemprestimo");
            return dataEmprestimo;
            
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return dataEmprestimo;
    }
    
    //Enviando a data de devolução:
    public String getDataDevolucao(String codigoChecagem, String nomeChecagem) {
        String dataDevolucao = "";
        String sql = "select * from emprestarlivro where codigo = ? and nomeUsuario = ?;";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, codigoChecagem);
            stmt.setString(2, nomeChecagem);
            try (ResultSet rst = stmt.executeQuery()) {
                if (rst.next()) {
                    dataDevolucao = rst.getString("datadevolucao");
                }
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }

        return dataDevolucao;
    }
    
    //Enviando o status do empréstimo:
    public String getStatusEmprestimo() {
        String status = "";
        try {
            String sql = "select * from emprestarlivro;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            
            status = rst.getString("statusEmprestimo");
            return status;
        }
        catch(Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return status;
    }

    //Enviando o nome de usuário:
    public String getNomeUsuario() {
        String nome = "";
        try {
            String sql = "select * from emprestarlivro;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            
            nome = rst.getString("nomeUsuario");
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return nome;
    }
    
    //ArrayList para exibir todos os empréstimos juntos de um determinado período de tempo.
    public ArrayList<String> getEmprestimosEspecificos(String dataemprestimo1, String dataemprestimo2) {
        ArrayList<String> emprestimos = new ArrayList<>();
        try {
            String sql = "select * from emprestarlivro where STR_TO_DATE(dataemprestimo, '%d/%m/%Y') between STR_TO_DATE(?, '%d/%m/%Y') and STR_TO_DATE(?, '%d/%m/%Y')";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, dataemprestimo1);
            sttmt.setString(2, dataemprestimo2);
            ResultSet rst =   sttmt.executeQuery();            
            while (rst.next()) {
                String codigo = rst.getString("codigo");
                String dataEmpres = rst.getString("dataemprestimo");
                String dataDev = rst.getString("datadevolucao");
                String status = rst.getString("statusEmprestimo");
                String nomeUsuario = rst.getString("nomeUsuario");
                emprestimos.add("Código: " + codigo);
                emprestimos.add("Nome de Usuário: " + nomeUsuario);
                emprestimos.add("Data de empréstimo: " + dataEmpres);
                emprestimos.add("Data de devolução: " + dataDev);
                emprestimos.add("Status do empréstimo: " + status);
            }
        }
    catch (Exception erro) {
            System.out.println("ERRO: " + erro);
    }
        return emprestimos;
    }

    //Verificar nome:
    public boolean verificarNome(String nomeUsuario) {
        String sql = "select * from emprestarlivro where nomeUsuario = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nomeUsuario);
            try (ResultSet rst = stmt.executeQuery()) {
                if (rst.next()) {
                    return true;
                }
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return false;
    }
     //Verificar código:

    public boolean verificarCodigo(String codigo) {
        String sql = "select * from emprestarlivro where codigo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, codigo);
            try (ResultSet rst = stmt.executeQuery()) {
                if (rst.next()) {
                    return true;
                }
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return false;
    }
    //Verificar status:
    public boolean verificarStatus(String nome, String codigo, String status) {
        String sql = "select * from emprestarlivro where nomeUsuario = ? and codigo = ? and statusEmprestimo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, codigo);
            stmt.setString(3, status);
            try (ResultSet rst = stmt.executeQuery()) {
                if (rst.next()) {
                    return true; 
                }
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return false;
    }
    
    //Contar quantos empréstimos foram realizados:
    public int quantidadeEmprestimosRealizados() {
        int quantidadeEmprestimos = 0;
        try {
            String sql = "select COUNT(*) as quantidadeTotalDeEmprestimos from emprestarlivro";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while(rst.next()){
                quantidadeEmprestimos = rst.getInt("quantidadeTotalDeEmprestimos");
                return quantidadeEmprestimos;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return quantidadeEmprestimos;
    }
}
