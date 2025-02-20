import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarUsuario {

    private String senha;
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    private String tipoUsuario;
    
    public CadastrarUsuario(String nome, String email, String telefone, String dataNascimento, String endereco, String tipoUsuario, String senha){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
    }
    
    public void exibirUsuario() {
        JOptionPane.showMessageDialog(null, "Nome do usuário: " + nome
                + "\nE-mail do usuário: " + email
                + "\nTelefone do usuário: " + telefone
                + "\nData de nascimento: " + dataNascimento
                + "\nEndereço: " + endereco);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}