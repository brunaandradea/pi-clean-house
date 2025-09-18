package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empregadas extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String nome;

    public String cpf;

    public String email;

    public String telefone;
    
    public String endereco;
    
    public String descricao;
    
    public LocalDate data_nascimento;

    public LocalDate data_cadastro;

    public Boolean status;

    public LocalDateTime ultima_atualizacao;

    public String atualizado_por;

}
