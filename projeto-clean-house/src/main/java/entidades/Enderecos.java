package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enderecos extends PanacheEntityBase{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    public Integer id;
    public String rua;
    public Integer numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    public Double latitude;
    public Double longitude;


}