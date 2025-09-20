package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class EnderecosTests {
    @Test
    @Transactional

    public void cadastraUmNovoEndereco(){
        Enderecos endereco = new Enderecos();
        endereco.rua = "Rua Carmelice";
        endereco.numero = 278;
        endereco.bairro = "Vila Nova";
        endereco.cep = "12345-678";
        endereco.cidade = "Ourinhos";
        endereco.complemento = "casa";
        endereco.estado = "São Paulo";
        endereco.latitude = -23.561684;
        endereco.longitude = -46.655981;

        endereco.persist();

        Assertions.assertEquals(6, endereco.id);


    }


}