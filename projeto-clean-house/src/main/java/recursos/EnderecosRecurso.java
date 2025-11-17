package recursos;

import java.util.List;

import entidades.Enderecos;
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

@Path ("enderecos")
public class EnderecosRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Enderecos> listar(){
        return Enderecos.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvarEndereco (Enderecos enderecos){
        enderecos.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Enderecos enderecos = Enderecos.findById(id);

        if (enderecos != null) {
            enderecos.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Enderecos enderecos) {
        Enderecos enderecosExistente = Enderecos.findById(id);

        if (enderecosExistente != null) {
            enderecosExistente.rua = enderecos.rua;
            enderecosExistente.numero = enderecos.numero;
            enderecosExistente.bairro = enderecos.bairro;
            enderecosExistente.cidade = enderecos.cidade;
            enderecosExistente.estado = enderecos.estado;
            enderecosExistente.cep = enderecos.cep;

            enderecosExistente.persist();
        }
    }
}