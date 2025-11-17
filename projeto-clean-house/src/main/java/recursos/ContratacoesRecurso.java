package recursos;

import java.util.List;

import entidades.Contratacoes;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path ("contratacoes")
public class ContratacoesRecurso {
    @GET
    public List<Contratacoes> listar() {
        return Contratacoes.listAll(Sort.ascending("id"));
}

    @POST
    @Transactional
    public void salvar (Contratacoes contratacoes) {
        contratacoes.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Contratacoes contratacoes = Contratacoes.findById(id);

        if (contratacoes != null) {
            contratacoes.delete();
        }
    }
    
    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Contratacoes contratacoes)
    {
        Contratacoes contratacoesExistente = Contratacoes.findById(id);

        if (contratacoesExistente != null) {
            contratacoesExistente.data_contratacao = contratacoes.data_contratacao;
            contratacoesExistente.status = contratacoes.status;
            contratacoesExistente.clientes = contratacoes.clientes;
            contratacoesExistente.servicos = contratacoes.servicos;

            contratacoesExistente.persist();
        }
    }
}
