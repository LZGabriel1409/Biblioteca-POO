import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }

    public Livro buscarLivro(String codigo){
        for(Livro l : livros){
            if(l.getCodigo().equals(codigo)){
                return l;
            }
        }
        return null;
    }
}