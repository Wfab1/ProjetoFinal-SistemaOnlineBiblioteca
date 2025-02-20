import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class CadastrarUsuarioDAO {

    Connection conexao;

    public CadastrarUsuarioDAO() {
        conexao = new ConexaoUsuario().getConexao();
    }

    //Inserir no banco de dados:
    public void inserirUsuario(CadastrarUsuario cadastrarUsuario) {
        try {
            String sql = "insert into cadastrarusuario (Nome, Email, Telefone, DataNascimento, Endereco, TipoUsuario, Senha) values ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, cadastrarUsuario.getNome());
            ps.setString(2, cadastrarUsuario.getEmail());
            ps.setString(3, cadastrarUsuario.getTelefone());
            ps.setString(4, cadastrarUsuario.getDataNascimento());
            ps.setString(5, cadastrarUsuario.getEndereco());
            ps.setString(6, cadastrarUsuario.getTipoUsuario());
            ps.setString(7, cadastrarUsuario.getSenha());

            ps.executeUpdate();    //mandando para o banco

            System.out.println("\n Usuário inserido com sucesso!");
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);

        }
    }

    //Remover do banco
    public void remover(String nome) {
        try {
            String sql = "delete from cadastrarusuario where Nome = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ps.executeUpdate();    //mandando para o banco

            System.out.println("\n Usuario removido com sucesso!");
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");

        } catch (Exception erro) {
            System.out.println("ERRO " + erro);

        }
    }

    //Exibir informações do banco de dados: 
    public void consultarTudo() {

        try {
            String sql = "select * from cadastrarusuario;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                String nome = rst.getString("Nome");
                String email = rst.getString("Email");
                String telefone = rst.getString("Telefone");
                String dataNascimento = rst.getString("DataNascimento");
                String endereco = rst.getString("Endereco");
                String tipoUsuario = rst.getString("TipoUsuario");
                JOptionPane.showMessageDialog(null, "Nome: " + nome
                        + "\nE-mail: " + email
                        + "\nTelefone: " + telefone
                        + "\nData de nascimento: " + dataNascimento
                        + "\nEndereço: " + endereco
                        + "\nTipo Usuário: " + tipoUsuario);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }
    
    //ArrayList para exibir todos os usuários juntos:
    public ArrayList<String> listaUsuarios(){
        ArrayList<String> usuarios = new ArrayList<String>();
        try {
            String sql = "select * from cadastrarusuario;";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while (rst.next()) {
                String nome = rst.getString("Nome");
                String email = rst.getString("Email");
                String telefone = rst.getString("Telefone");
                String dataNascimento = rst.getString("DataNascimento");
                String endereco = rst.getString("Endereco");
                String tipoUsuario = rst.getString("TipoUsuario");
                usuarios.add("Nome: "+nome);
                usuarios.add("Email: "+email);
                usuarios.add("Telefone: "+telefone);
                usuarios.add("Data Nascimento: "+dataNascimento);
                usuarios.add("Endereço: "+endereco);
                usuarios.add("Tipo de usuário: "+tipoUsuario);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return usuarios;
    }
    
    //Verificação do tipo de usuário para a tela de login:
    public boolean getTipoUsuario(String nomeUsuario) {
        try {
            String sql="select * from cadastrarusuario where Nome = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, nomeUsuario);
            ResultSet rst=sttmt.executeQuery();
            while (rst.next()) {
                String usuarioTipo = rst.getString("TipoUsuario");
                if (usuarioTipo.equalsIgnoreCase("Bibliotecário")) {
                  return true;
                }
                else if (usuarioTipo.equalsIgnoreCase("Usuário normal")) {
                    return false;
                }
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return false;
    }
    
    //Verificar nome
    public boolean verificarNome (String nomeUsuario){
        boolean Nome = false;
        try{
            String sql="select * from cadastrarusuario where Nome = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, nomeUsuario);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                return true;
            }
            
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return Nome;
    }
    
    //Verificando o nome:
    public String retornarNome (String nomeUsuario){
        String nome = "";
        try{
            String sql="select * from cadastrarusuario where Nome = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, nomeUsuario);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String nomeExibir = rst.getString("Nome");
                return nomeExibir;
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return nome;
    }
    
    //Enviando a senha:
    public String retornarSenha (String senhaTeste){
        String senha = "";
        try{
            String sql="select * from cadastrarusuario where Senha = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, senhaTeste);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String senhaExibir = rst.getString("Senha");
                return senhaExibir;
            }
            
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return senha;
    }
    
    //Verificar senha:
    public boolean verificarSenha (String senhaTeste){
        try{
            String sql="select * from cadastrarusuario where Senha = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, senhaTeste);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                return true;
            }
            
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return false;
    }
    
    //Verificar todos os nomes cadastrados:
    public String getNomeUsuario(){
        String nome = "";
        try{
            String sql="select * from cadastrarusuario;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                nome = rst.getString("Nome");
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
            return nome;
    }
    
    //Método para o login:
    public Usuario getUsuario(String nomeUsuario){
        try{
            String sql="select * from cadastrarusuario where Nome = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, nomeUsuario);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String nome = rst.getString("Nome");
                String senha = rst.getString("Senha");
                Usuario usuarioEncontrado = new Usuario();
                usuarioEncontrado.setNome(nome);
                usuarioEncontrado.setSenha(senha);
                return usuarioEncontrado;
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
        
        return null;
    }
    
    //Consultando usuários de nomes específicos
    public ArrayList<String> getUsuariosNomeEspecificos(String nome){
         ArrayList<String> usuarios = new ArrayList<String>();
        try{
            String sql = "select * from cadastrarusuario where Nome LIKE '%" + nome + "%'";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while (rst.next()) {
                String nomeExibir = rst.getString("Nome");
                String email = rst.getString("Email");
                String telefone = rst.getString("Telefone");
                String dataNascimento = rst.getString("DataNascimento");
                String endereco = rst.getString("Endereco");
                String tipoUsuario = rst.getString("TipoUsuario");
                usuarios.add("Nome: "+nomeExibir);
                usuarios.add("Email: "+email);
                usuarios.add("Telefone: "+telefone);
                usuarios.add("Data Nascimento: "+dataNascimento);
                usuarios.add("Endereço: "+endereco);
                usuarios.add("Tipo de usuário: "+tipoUsuario);
            }
        } catch(Exception erro){
            System.out.println("ERRO: "+erro);
        }
        return usuarios;
    }
    
    //Enviando a senha
    public String getSenhaUsuario(){
        String senha = "";
        try{
            String sql="select * from cadastrarusuario;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                senha = rst.getString("Senha");
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
            return senha;
    }
    
    //Contar quantos usuários estão cadastrados:
    public int quantidadeUsuariosCadastrados() {
        int quantidadeUsuarios = 0;
        try {
            String sql = "select COUNT(*) as quantidadeTotalDeUsuarios from cadastrarusuario";
            PreparedStatement sttmt = conexao.prepareStatement(sql);
            ResultSet rst = sttmt.executeQuery();
            while(rst.next()){
                quantidadeUsuarios = rst.getInt("quantidadeTotalDeUsuarios");
                return quantidadeUsuarios;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        return quantidadeUsuarios;
    }
    
    //Enviando a senha com base no nome de usuário:
    public String retornarSenhaNomeUsuario (String nomeUsuario){
        String senha = "";
         try{
            String sql="select * from cadastrarusuario where Nome = ?;";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, nomeUsuario);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                senha = rst.getString("Senha");
            }
        } catch (Exception erro){
            System.out.println("ERRO: "+erro);
        }
            return senha;
    }
}