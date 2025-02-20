import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.*;

public class EmprestarLivro {

    private String dataEmprestimo;
    private String dataDevolucao;
    private String nomeUsuario;
    private String codigo;
    private String senha;
    private String statusDevolucao;
    CadastrarLivroDAO livrosBanco = new CadastrarLivroDAO();
    CadastrarUsuarioDAO usuariosbanco = new CadastrarUsuarioDAO();

    Scanner leitura = new Scanner(System.in);

    public EmprestarLivro(String codigo, String Usuario) {
        try {
            this.codigo = codigo;
            this.nomeUsuario = Usuario;
            dataEmprestimo = JOptionPane.showInputDialog("Informe a data do empréstimo no formato xx/xx/xxxx:  ");
            senha = JOptionPane.showInputDialog("Informe a senha para realizar o empréstimo: ");
            statusDevolucao = "Pendente";
            Calendar calendar = Calendar.getInstance();
            String dataEmprestimoFormatada = this.dataEmprestimo + "\n";
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(dataEmprestimoFormatada);
            } catch (Exception erro) {
                System.out.println("ERRO: " + erro);
            }
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 7);
            Date dt = calendar.getTime();
            this.dataDevolucao = dateFormat.format(dt);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }

    public void exibirEmprestimo() {
        String mensagem = "\n";
        mensagem += "Usuário: " + nomeUsuario + "\n";
        mensagem += "Livro: " + codigo + "\n";
        mensagem += "Data de Empréstimo: " + dataEmprestimo + "\n";
        Calendar calendar = Calendar.getInstance();
        String dataEmprestimoFormatada = this.dataEmprestimo + "\n";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dataEmprestimoFormatada);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date dt = calendar.getTime();
        this.dataDevolucao = dateFormat.format(dt);
        mensagem += "Data de Devolução: " + dataDevolucao + "\n";

        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void verificarEmprestimo() {
        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date date = new Date();
        String dataAtual = dateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        String dataEmprestimoFormatada = this.dataEmprestimo;
        try {
            date = dateFormat.parse(dataEmprestimoFormatada);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date dt = calendar.getTime();
        this.dataDevolucao = dateFormat.format(dt);
        if (calendar.compareTo(calendar2) == 0) {
            JOptionPane.showMessageDialog(null, "Hoje é o dia que encerra o prazo da devolução!");
        } else if (calendar.compareTo(calendar2) == 1) {
            JOptionPane.showMessageDialog(null, "A devolução vence dia " + dataDevolucao + ", portanto a devolução não está atrasada.");
        } else if (calendar.compareTo(calendar2) == -1) {
            JOptionPane.showMessageDialog(null, "A devolução está atrasada! Ela venceu dia " + dataDevolucao);
        }
    }
    
public void devolverLivro(String isbn){
    if ("Pendente".equalsIgnoreCase(this.statusDevolucao)) {
        if (codigo.equalsIgnoreCase(isbn)) {
            JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!");
            this.statusDevolucao = "Concluído";
        } else {
            JOptionPane.showMessageDialog(null, "Este livro já foi devolvido!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "ISBN inválido!");
    }
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusDevolucao() {
        return statusDevolucao;
    }

    public void setStatusDevolucao(String statusDevolucao) {
        this.statusDevolucao = statusDevolucao;
    }

}
