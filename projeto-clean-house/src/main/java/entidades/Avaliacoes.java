package entidades;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avaliacoes extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String tipo_avaliacao;

    public Integer nota;

    public String comentario;

    public LocalDateTime data_avaliacao;

    @ManyToOne
    public Empregadas empregadas;

    @ManyToOne
    public Clientes clientes;

    @ManyToOne
    public Contratacoes contratacoes;

}
