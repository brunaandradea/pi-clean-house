package recursos;

import java.util.List;

import entidades.Avaliacoes;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path ("avaliacoes")
public class AvaliacoesRecurso {
    @GET
    public List<Avaliacoes> listar() {
        return Avaliacoes.listAll(Sort.ascending("id"));
}

    @POST
    @Transactional
    public void salvar (Avaliacoes avaliacoes) {
        avaliacoes.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Avaliacoes avaliacoes = Avaliacoes.findById(id);

        if (avaliacoes != null) {
            avaliacoes.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Avaliacoes avaliacoes) {
        Avaliacoes avaliacoesExistente = Avaliacoes.findById(id);

        if (avaliacoesExistente != null) {
            avaliacoesExistente.nota = avaliacoes.nota;
            avaliacoesExistente.comentario = avaliacoes.comentario;
            avaliacoesExistente.data_avaliacao = avaliacoes.data_avaliacao;
            avaliacoesExistente.clientes = avaliacoes.clientes;
            avaliacoesExistente.contratacoes = avaliacoes.contratacoes;

            avaliacoesExistente.persist();
        }
    }
}
