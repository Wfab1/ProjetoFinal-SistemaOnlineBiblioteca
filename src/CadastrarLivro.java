import java.util.*;
import javax.swing.JOptionPane;

public class CadastrarLivro {

    Scanner scanner = new Scanner(System.in);
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    
    public CadastrarLivro(String isbn, String titulo, String autor, String genero){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public void exibirLivro() {
        JOptionPane.showMessageDialog(null, "ISBN do livro: " + isbn
                +"\nTítulo: " + titulo
                +"\nAutor do livro: " +autor
                +"\nGênero do livro: " + genero);
    }
  
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}