package recursos;

import java.util.List;

import entidades.Empregadas;
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

@Path("empregadas")
public class EmpregadasRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empregadas> listar() {
        return Empregadas.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Empregadas empregadas) {
        empregadas.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir(@PathParam("id") Integer id) {
        Empregadas empregadas = Empregadas.findById(id);

        if (empregadas != null) {
            empregadas.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar(@PathParam("id") Integer id, Empregadas empregadas) {
        Empregadas empregadasExistente = Empregadas.findById(id);

        if (empregadasExistente != null) {
            empregadasExistente.nome = empregadas.nome;
            empregadasExistente.cpf = empregadas.cpf;
            empregadasExistente.endereco = empregadas.endereco;
            empregadasExistente.telefone = empregadas.telefone;
            empregadasExistente.email = empregadas.email;

            empregadasExistente.persist();
        }
    }

}
