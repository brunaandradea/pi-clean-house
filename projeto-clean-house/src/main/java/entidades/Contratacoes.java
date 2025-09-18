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
public class Contratacoes extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public LocalDate data_contratacao;

    public LocalDate data_servico;

    public LocalDate hora_inicio;

    public Integer horas_contratadas;

    public Double valor_total;

    public Boolean status;

    public LocalDateTime ultima_atualizacao;

    @ManyToOne
    public Empregadas empregadas;

    @ManyToOne
    public Clientes clientes;

    @ManyToOne
    public Servicos servicos;

}
