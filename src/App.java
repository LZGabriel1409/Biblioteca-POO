import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();

        int opcao = 0;

        while(opcao != 5){

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastrar Livro\n" +
                    "2 - Cadastrar Usuario\n" +
                    "3 - Listar Livros\n" +
                    "4 - Emprestar Livro\n" +
                    "5 - Sair"
            ));

            if(opcao == 1){

                String titulo = JOptionPane.showInputDialog("Titulo do livro:");
                String autor = JOptionPane.showInputDialog("Autor:");
                String codigo = JOptionPane.showInputDialog("Codigo:");

                Livro livro = new Livro(titulo, autor, codigo);
                biblioteca.adicionarLivro(livro);

                JOptionPane.showMessageDialog(null,"Livro cadastrado!");

            }

            if(opcao == 2){

                String nome = JOptionPane.showInputDialog("Nome:");
                String cpf = JOptionPane.showInputDialog("CPF:");
                String numero = JOptionPane.showInputDialog("Telefone:");
                String codigo = JOptionPane.showInputDialog("Codigo do usuario:");

                Usuario usuario = new Usuario(nome, cpf, numero, codigo);
                biblioteca.adicionarUsuario(usuario);

                JOptionPane.showMessageDialog(null,"Usuario cadastrado!");

            }

            if(opcao == 3){

                String lista = "";

                for(Livro l : biblioteca.getLivros()){
                    lista += l.toString() + "\n";
                }

                JOptionPane.showMessageDialog(null, lista);

            }

            if(opcao == 4){

                String codigo = JOptionPane.showInputDialog("Codigo do livro:");

                Livro livro = biblioteca.buscarLivro(codigo);

                if(livro != null && !livro.isEmprestado()){
                    livro.emprestar();
                    JOptionPane.showMessageDialog(null,"Livro emprestado!");
                }else{
                    JOptionPane.showMessageDialog(null,"Livro não encontrado ou já emprestado");
                }

            }

        }

    }
}