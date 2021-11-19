package model;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean status = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void ativarCliente() {
        this.status = true;
    }

    public void desativarCliente(){
        this.status = false;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", status=" + status +
                '}';
    }
}
