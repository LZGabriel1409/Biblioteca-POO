public class Usuario {

    private String nome;
    private String cpf;
    private String numero;
    private String codigo;

    public Usuario(String nome, String cpf, String numero, String codigo){
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNumero(){
        return numero;
    }

    public String getCodigo(){
        return codigo;
    }

    public String toString(){
        return "Codigo: " + codigo + " | Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + numero;
    }
}