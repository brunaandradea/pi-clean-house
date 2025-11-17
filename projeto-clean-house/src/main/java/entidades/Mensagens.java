package entidades;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Mensagens extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String mensagem;

    public LocalDateTime data_envio;

    public Boolean status;

    @ManyToOne
    public Contratacoes contratacoes;

    @ManyToOne
    public Clientes clientes;

    @ManyToOne
    public Empregadas empregadas;

    public Object remetente;

    public Object conteudo;

    public Object destinatario;

}
