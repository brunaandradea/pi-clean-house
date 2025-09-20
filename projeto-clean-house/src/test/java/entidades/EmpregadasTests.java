package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class EmpregadasTests {
    @Test
    @Transactional
    public void testCriarEBuscarEmpregada () {
        Empregadas empregada = new Empregadas();
        empregada.nome = "Maria Souza";
        empregada.cpf = "854.123.456-78";
        empregada.email = "maria.souza@cleanhouse.com";
        empregada.telefone = "(21) 98765-4321";
        empregada.endereco = "Rua das Flores, 456, Rio de Janeiro, RJ";
        empregada.descricao = "Especialista em limpeza residencial e comercial.";
        empregada.data_nascimento = LocalDate.of(1990, 5, 15);
        empregada.data_cadastro = LocalDate.now();
        empregada.status = true;

        empregada.persist();

        Assertions.assertEquals(6, empregada.id);      
    }

}
