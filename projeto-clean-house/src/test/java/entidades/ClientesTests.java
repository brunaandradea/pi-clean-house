package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ClientesTests {
    @Test
    @Transactional

    public void CadastrarNovaClienteESalvarUmNovoEndereco(){
        Clientes cliente = new Clientes();
        cliente.nome = "Carmen";
        cliente.cpf = "123.456.789-11";
        cliente.email = "carmen@gmail.com";
        cliente.telefone = "(11) 98765-3355";
        cliente.dataCadastro = LocalDate.of (2025, 04, 12);
        cliente.ulimaAtualizacao = LocalDateTime.of(2025, 8, 25, 14, 35, 00);
        cliente.atualizadoPor = "Carmen";

        cliente.persist();

        Assertions.assertEquals(6, cliente.id);
    }

}