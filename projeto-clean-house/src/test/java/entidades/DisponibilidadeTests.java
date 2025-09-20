package entidades;

import java.time.LocalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class DisponibilidadeTests {

    @Test
    @Transactional
    public void testCriarUmaDisponibilidade(){
        Disponibilidade disponibilidade = new Disponibilidade();
        disponibilidade.dia_semana = "TERCA-FEIRA";
        disponibilidade.hora_inicio = LocalTime.of(9, 0); 
        disponibilidade.hora_fim = LocalTime.of(18, 0); 
        disponibilidade.empregadas = Empregadas.findById(1);
      
        disponibilidade.persist();

        Assertions.assertEquals(6, disponibilidade.id);
    }
}