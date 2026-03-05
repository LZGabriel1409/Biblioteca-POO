import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String menu = "Bem vindo a biblioteca\n" +
                      "==============\n"+
                      "1 - Listar acervo\n"+
                      "==============\n" +
                      "0 - Sair\n"+
                      "==============\n" +
                      "Escolha uma opção:";
        String opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, menu);

            if (opcao == null) {
                break;
            }

            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Acervo");
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Até a próxima!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (!opcao.equals("0"));
    }
}
