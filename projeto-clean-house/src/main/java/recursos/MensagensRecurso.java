package recursos;

import java.util.List;

import entidades.Mensagens;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("mensagens")
public class MensagensRecurso {
    @GET
    public List<PanacheEntityBase> listar() {
        return Mensagens.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar (Mensagens mensagens) {
        mensagens.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Mensagens mensagens = Mensagens.findById(id);

        if (mensagens != null) {
            mensagens.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar (@PathParam("id") Integer id, Mensagens mensagens) {
        Mensagens mensagensExistente = Mensagens.findById(id);

        if (mensagensExistente != null) {
            mensagensExistente.conteudo = mensagens.conteudo;
            mensagensExistente.data_envio = mensagens.data_envio;
            mensagensExistente.remetente = mensagens.remetente;
            mensagensExistente.destinatario = mensagens.destinatario;

            mensagensExistente.persist();
        }
    }
}
