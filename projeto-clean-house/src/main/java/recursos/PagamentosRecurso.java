package recursos;

import java.util.List;

import entidades.Pagamentos;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path ("pagamentos")
public class PagamentosRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pagamentos> listar() {
        return Pagamentos.listAll(Sort.ascending("id"));
}

    @POST
    @Transactional
    public void salvar (Pagamentos pagamentos) {
        pagamentos.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Pagamentos pagamentos = Pagamentos.findById(id);

        if (pagamentos != null) {
            pagamentos.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Pagamentos pagamentos) {
        Pagamentos pagamentosExistente = Pagamentos.findById(id);

        if (pagamentosExistente != null) {
            pagamentosExistente.valor = pagamentos.valor;
            pagamentosExistente.metodoPagamento = pagamentos.metodoPagamento;
            pagamentosExistente.status = pagamentos.status;
            pagamentosExistente.data_pagamento = pagamentos.data_pagamento;
            pagamentosExistente.comprovante_url = pagamentos.comprovante_url;
            pagamentosExistente.contratacoes = pagamentos.contratacoes;

            pagamentosExistente.persist();
        }
    }
}