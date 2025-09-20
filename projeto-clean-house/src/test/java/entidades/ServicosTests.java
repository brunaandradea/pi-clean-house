package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ServicosTests {
    @Test
    @Transactional
    public void testInserirUmServico(){
        Servicos servicos = new Servicos();
        servicos.nome = "Babá de Pet";
        servicos.descricao = "Cuidado com animais de estimação, incluindo passeios, alimentação e companhia durante a ausência dos donos";
        servicos.categoria = "Cuidados Especiais";

        servicos.persist();

        Assertions.assertEquals(6, servicos.id);
    }

}