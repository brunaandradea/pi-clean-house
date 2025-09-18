package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Clientes extends PanacheEntityBase{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id;
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public LocalDate dataCadastro;
    public LocalDateTime ulimaAtualizacao;
    public String atualizadoPor;

    @ManyToOne
    public Enderecos endereco;
}