import java.util.Random;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();

        int opcao = 1;

        while(opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastro\n" +
                "2 - Login\n"+
                "0 - Sair"
            ));
            if(opcao < 0 || opcao > 2){
                        JOptionPane.showMessageDialog(null,"Opção inválida.");
                    };

            if(opcao == 1){

                String nome = JOptionPane.showInputDialog("Nome:");
                String cpf = JOptionPane.showInputDialog("CPF:");
                String numero = JOptionPane.showInputDialog("Telefone:");
                Random codeuser = new Random();
                String codigo = String.valueOf(codeuser.nextInt(10000));
                JOptionPane.showMessageDialog(null, "Codigo de usuario: " + codigo);

                Usuario usuario = new Usuario(nome, cpf, numero, codigo);
                biblioteca.adicionarUsuario(usuario);

                JOptionPane.showMessageDialog(null,"Usuario cadastrado!");
            
                while(opcao != 6){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "1 - Cadastrar Livro\n" +
                        "2 - Listar Livros\n" +
                        "3 - Devolver Livro\n" +
                        "4 - Emprestar Livro\n" +
                        "5 - Lista de Usuarios\n" +
                        "6 - Cadastro/Login"
                    ));

                        if(opcao == 1){

                            String titulo = JOptionPane.showInputDialog("Titulo do livro:");
                            String autor = JOptionPane.showInputDialog("Autor:");
                            Random codelivro = new Random();
                            String codigoLivro = String.valueOf(codelivro.nextInt(10000));
                            JOptionPane.showMessageDialog(null, "Codigo do Livro: " + codigoLivro);
                        

                            Livro livro = new Livro(titulo, autor, codigoLivro);
                            biblioteca.adicionarLivro(livro);

                            JOptionPane.showMessageDialog(null,"Livro cadastrado!");

                        }

                        if(opcao == 2){

                            String lista = "";

                            for(Livro l : biblioteca.getLivros()){

                                String status;

                                if(l.isEmprestado()){
                                    status = "Emprestado";
                                }else{
                                    status = "Disponível";
                                }

                                lista += l.toString() + " | Estado: " + status +"\n";
                            }

                            JOptionPane.showMessageDialog(null, lista);

                        }
                
                        if(opcao == 3){

                            String codigoLivro = JOptionPane.showInputDialog("Codigo do livro:");

                            Livro livro = biblioteca.buscarLivro(codigoLivro);

                            if(livro != null && livro.isEmprestado()){
                                livro.devolver();
                                JOptionPane.showMessageDialog(null,"Livro devolvido!");
                            }else{
                                JOptionPane.showMessageDialog(null,"Livro não encontrado ou não emprestado");
                            }

                        }

                        if(opcao == 4){
                            String codigoLivro = JOptionPane.showInputDialog("Codigo do livro:");

                            Livro livro = biblioteca.buscarLivro(codigoLivro);

                            if(livro != null && !livro.isEmprestado()){
                                livro.emprestar();
                               JOptionPane.showMessageDialog(null,"Livro emprestado!");
                           }else{
                               JOptionPane.showMessageDialog(null,"Livro não encontrado ou já emprestado");
                           }
                        }

                        if(opcao == 5){
                            String lista = "";

                            for(Usuario u : biblioteca.getUsuarios()){
                                lista += u.toString() + "\n";
                            }

                             JOptionPane.showMessageDialog(null, lista);

                        }

                    if(opcao < 1 || opcao > 6){
                        JOptionPane.showMessageDialog(null,"Opção inválida.");
                    }
                }
            }
            if (opcao == 2){
                String codigo = JOptionPane.showInputDialog("Codigo de usuario:");
                boolean encontrado = false;

                for(Usuario u : biblioteca.getUsuarios()){
                    if(u.getCodigo().equals(codigo)){
                        encontrado = true;
                        JOptionPane.showMessageDialog(null,"Login bem sucedido!");
                        
                        while(opcao != 0){
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "1 - Cadastrar Livro\n" +
                        "2 - Listar Livros\n" +
                        "3 - Devolver Livro\n" +
                        "4 - Emprestar Livro\n" +
                        "5 - Lista de Usuarios\n" +
                        "0 - Sair"
                    ));

                        if(opcao == 1){

                            String titulo = JOptionPane.showInputDialog("Titulo do livro:");
                            String autor = JOptionPane.showInputDialog("Autor:");
                            String codigoLivro = JOptionPane.showInputDialog("Codigo:");

                            Livro livro = new Livro(titulo, autor, codigoLivro);
                            biblioteca.adicionarLivro(livro);

                            JOptionPane.showMessageDialog(null,"Livro cadastrado!");

                        }

                        if(opcao == 2){

                            String lista = "";

                            for(Livro l : biblioteca.getLivros()){

                                String status;

                                if(l.isEmprestado()){
                                    status = "Emprestado";
                                }else{
                                    status = "Disponível";
                                }

                                lista += l.toString() + " | Estado: " + status + "\n";
                            }

                            JOptionPane.showMessageDialog(null, lista);

                        }
                
                        if(opcao == 3){

                            String codigoLivro = JOptionPane.showInputDialog("Codigo do livro:");

                            Livro livro = biblioteca.buscarLivro(codigoLivro);

                            if(livro != null && livro.isEmprestado()){
                                livro.devolver();
                                JOptionPane.showMessageDialog(null,"Livro devolvido!");
                            }else{
                                JOptionPane.showMessageDialog(null,"Livro não encontrado ou não emprestado");
                            }

                        }

                        if(opcao == 4){
                            String codigoLivro = JOptionPane.showInputDialog("Codigo do livro:");

                            Livro livro = biblioteca.buscarLivro(codigoLivro);

                            if(livro != null && !livro.isEmprestado()){
                                livro.emprestar();
                               JOptionPane.showMessageDialog(null,"Livro emprestado!");
                           }else{
                               JOptionPane.showMessageDialog(null,"Livro não encontrado ou já emprestado");
                           }
                        }

                        if(opcao == 5){
                            String lista = "";

                            for(Usuario uu : biblioteca.getUsuarios()){
                                lista += uu.toString() + "\n";
                            }

                             JOptionPane.showMessageDialog(null, lista);

                        }

                    if(opcao < 0 || opcao > 5){
                        JOptionPane.showMessageDialog(null,"Opção inválida.");
                    }
                }
                    }
                }

                if(!encontrado){
                    JOptionPane.showMessageDialog(null,"Usuario não encontrado.");
                }
        }
     }
}
}
