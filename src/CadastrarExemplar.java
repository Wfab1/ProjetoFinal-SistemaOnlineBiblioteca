import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarExemplar {
    CadastrarExemplarDAO exemplaresbanco = new CadastrarExemplarDAO();
    private String codigo;
    private String isbn;

    public CadastrarExemplar(String isbn, String codigo) {
        this.codigo = codigo;
        this.isbn = isbn;
    }

    public void exibirExemplarLivro() {
        JOptionPane.showMessageDialog(null, "Código do exemplar de livro: " + codigo
        +"\nISBN do livro ao qual o exemplar possui relação: "+isbn);
        
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
