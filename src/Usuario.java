public class Usuario {
    private String codigo;
    private String nome;
    private String cpf;
    private String numero;

    public Usuario (String nome, String cpf, String numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return cpf;
    }


}