package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class MensagensTests {
    @Test
    @Transactional
    public void testCriarUmaMensagemDeUmClienteParaUmaEmpregada(){
        Mensagens mensagens = new Mensagens();
        mensagens.mensagem = "Olá, gostaria de saber mais sobre o serviço.";
        mensagens.clientes = Clientes.findById(1);
        mensagens.empregadas = Empregadas.findById(1);

        mensagens.persist();

        Assertions.assertEquals(6, mensagens.id);

    }

}
