import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class CadastrarLivroDAO {
    Connection conexao;

    public CadastrarLivroDAO(){
        conexao = new ConexaoLivro().getConexao();        
    }
       
    //Inserir no banco de dados:
    public void inserirLivro(CadastrarLivro cadastrarLivro){
        try{
            String sql = "insert into cadastrarlivro (ISBN, Titulo, Autor, Genero) values ( ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
           
            ps.setString(1, cadastrarLivro.getIsbn());            
            ps.setString(2, cadastrarLivro.getTitulo());
            ps.setString(3, cadastrarLivro.getAutor());
            ps.setString(4, cadastrarLivro.getGenero());
            ps.executeUpdate();    //mandando para o banco
            System.out.println("\n Livro inserido com sucesso!");
            JOptionPane.showMessageDialog(null, "Livro inserido com sucesso!");
                           
        }catch(Exception erro){
          System.out.println("Erro: "+erro);

        }
    }
    
    //Remover do banco de dados:
    public void remover(String isbn){
        try{
            String sql = "delete from cadastrarlivro where ISBN = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, isbn);
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\n Livro removido com sucesso!");
                           
        }catch(Exception erro){
          System.out.println("ERRO: "+erro);

        }
    }
    
    //Exibir livros:
    public void consultarTudo(){
        try {
            String sql="select * from cadastrarlivro;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String isbn = rst.getString("ISBN");
                String titulo = rst.getString("Titulo");
                String autor = rst.getString("Autor");
                String genero = rst.getString("Genero");
                JOptionPane.showMessageDialog(null, "\n ISBN: " + isbn
                        + "\nTítulo: " + titulo
                        + "\nAutor: " + autor
                        + "\nGênero: " + genero);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: "+erro);
        }
    }
    
    //ArrayList para exibir todos os livros juntos:
    public ArrayList <String> listaLivros(){
        ArrayList <String> livros = new ArrayList <String>();
        try{
            String sql="select * from cadastrarlivro;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String isbn = rst.getString("ISBN");
                String titulo = rst.getString("Titulo");
                String autor = rst.getString("Autor");
                String genero = rst.getString("Genero");
                livros.add("ISBN: "+isbn);
                livros.add("Título: "+titulo);
                livros.add("Autor: "+autor);
                livros.add("Gênero: "+genero);
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return livros;
    }

    //Enviando os ISBN's dos livros cadastrados:
    public String getIsbn(String isbnTeste){
        String isbn = "";
        try{
            String sql="select * from cadastrarlivro where ISBN = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, isbnTeste);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                isbn = rst.getString("ISBN");
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
            return isbn;
    }
    
    //Consultar livros específicos:
    public ArrayList<String> getLivrosEspecificos(String autor, String genero){ 
        ArrayList<String> livros = new ArrayList<String>();
        try{
            String sql = "select * from cadastrarlivro where Autor LIKE ? and Genero LIKE ?;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            sttmt.setString(1, "%" + autor + "%");
            sttmt.setString(2, "%" + genero + "%");
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                String isbn = rst.getString("ISBN");
                String titulo = rst.getString("Titulo");
                String autorExibir = rst.getString("Autor");
                String generoExibir = rst.getString("Genero");
                livros.add("ISBN: "+isbn);
                livros.add("Título: "+titulo);
                livros.add("Autor: "+autorExibir);
                livros.add("Gênero: "+generoExibir);
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return livros;
    }
    
    //Verificar o isbn:
    public boolean verificarisbn(String isbn){
        try{
            String sql="select * from cadastrarlivro where ISBN = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, isbn);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                return true;
            }
        }
        catch(Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return false;
    }
    
    //Contar quantos livros estão cadastrados:
    public int quantidadeLivrosCadastrados() {
        int quantidadeLivros = 0;
        try {
            String sql = "select COUNT(*) as quantidadeTotalDeLivros from cadastrarlivro";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while(rst.next()){
                quantidadeLivros = rst.getInt("quantidadeTotalDeLivros");
                return quantidadeLivros;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return quantidadeLivros;
    }
}