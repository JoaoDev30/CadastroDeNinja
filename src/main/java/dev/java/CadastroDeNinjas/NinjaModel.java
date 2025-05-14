package dev.java.CadastroDeNinjas;
import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // a clase que estiver logo abaixo vai ser declarado como o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para fazer o id ser sequencial dentro do bd
    Long id;
    String nome;
    String email;
    int idade;

// Construtor Vazio ou no args constructor
    public NinjaModel() {
    }

// Construtor Cheio ou All args constructor
    public NinjaModel(String nome, String email, int idade) {

        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
// Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
