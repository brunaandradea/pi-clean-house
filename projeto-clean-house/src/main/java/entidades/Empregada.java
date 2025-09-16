package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empregada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    public String nome;

    public String cpf;

    public String email;

    public String telefone;
    
    public String endereco;
    
    public String descricao;
    
    public LocalDate data_nascimento;

    public LocalDateTime data_cadastro;

    public Boolean status;


    public LocalDate ultima_atualizacao;

    public String atualizado_por;

}
