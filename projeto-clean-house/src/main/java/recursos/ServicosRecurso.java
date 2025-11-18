package recursos;

import java.util.List;

import entidades.Servicos;
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

@Path ("servicos")
public class ServicosRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Servicos> listar() {
        return Servicos.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar (Servicos servicos) {
        servicos.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Servicos servicos = Servicos.findById(id);

        if (servicos != null) {
            servicos.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Servicos servicos) {
        Servicos servicosExistente = Servicos.findById(id);

        if (servicosExistente != null) {
            servicosExistente.nome = servicos.nome;
            servicosExistente.descricao = servicos.descricao;
            servicosExistente.categoria = servicos.categoria;

            servicosExistente.persist();
        }
    }
}