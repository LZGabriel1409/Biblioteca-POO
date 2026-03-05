public class Livro {
    private String codigo;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getCodigo(){
        return codigo;
    }
}
