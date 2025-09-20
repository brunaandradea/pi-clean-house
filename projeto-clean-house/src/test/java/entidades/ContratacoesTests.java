package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ContratacoesTests {
    @Test
    @Transactional
    public void testCriarEBuscarUmaContratacao(){
        Contratacoes contratacao = new Contratacoes();
        contratacao.data_contratacao = LocalDate.of(2024, 7, 15);
        contratacao.status = "PENDENTE";
        contratacao.clientes = Clientes.findById(1);
        contratacao.empregadas = Empregadas.findById(1);
        contratacao.servicos = Servicos.findById(1);

        contratacao.persist();

        Assertions.assertEquals(6, contratacao.id);
    }

}
