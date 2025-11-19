package entidades;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Mensagens extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id; 

    @Column(name = "mensagem") 
    public String mensagem;

    public LocalDateTime data_envio;

    public Boolean status;

    @ManyToOne
    @JoinColumn(name = "contratacoes_id") 
    public Contratacoes contratacoes;

    @ManyToOne
    @JoinColumn(name = "empregadas_id") 
    public Empregadas empregada;

    @ManyToOne
    @JoinColumn(name = "clientes_id") 
    public Clientes cliente;

}