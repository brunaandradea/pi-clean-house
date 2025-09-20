package entidades;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class NotificacoesTests {

    @Test
    @Transactional
    public void testCriarUmaNotificacao(){
     
        Notificacoes notificacao = new Notificacoes();
        notificacao.tipo_notificacao = "AGENDAMENTO";
        notificacao.mensagem = "Seu agendamento foi confirmado para amanhã.";
        notificacao.data_notificacao = LocalDateTime.now();
        notificacao.status = "ENVIADA";
        notificacao.empregadas = Empregadas.findById(1);
        notificacao.clientes = Clientes.findById(1);

        notificacao.persist();

        Assertions.assertEquals(6, notificacao.id);
    }
}