package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Notificacoes extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String tipo_notificacao;

    public String mensagem;

    public LocalDateTime data_notificacao;

    public String status;

    @ManyToOne
    public Empregadas empregadas;

    @ManyToOne
    public Clientes clientes;
}