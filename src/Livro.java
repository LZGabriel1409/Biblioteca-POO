public class Livro {

    private String titulo;
    private String autor;
    private String codigo;
    private boolean emprestado;

    public Livro(String titulo, String autor, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getCodigo(){
        return codigo;
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public void emprestar(){
        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor;
    }
}