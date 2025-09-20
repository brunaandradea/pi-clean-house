package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class AvaliacoesTests {
    @Test
    @Transactional
    public void testCriarUmaAvaliacao(){
        Avaliacoes avaliacoes = new Avaliacoes();
        avaliacoes.tipo_avaliacao = "SERVICO";
        avaliacoes.nota = 5;
        avaliacoes.comentario = "A Carla foi fantástica! Muito detalhista e profissional. Recomendo!";
        avaliacoes.data_avaliacao = java.time.LocalDateTime.now();
        avaliacoes.empregadas = Empregadas.findById(1);
        avaliacoes.clientes = Clientes.findById(1);

        avaliacoes.persist();

        Assertions.assertEquals(6, avaliacoes.id);
    }
}
