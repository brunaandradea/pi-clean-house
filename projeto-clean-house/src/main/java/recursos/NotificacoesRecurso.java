package recursos;

import java.util.List;

import entidades.Notificacoes;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("notificacoes")
public class NotificacoesRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <Notificacoes> listar () {
        return Notificacoes.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Notificacoes notificacoes) {
        notificacoes.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir(@PathParam("id") Integer id) {
        // Busca pela Notificacao usando o ID
        Notificacoes notificacao = Notificacoes.findById(id);

        if (notificacao != null) {
            notificacao.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}")
    public void editar(@PathParam("id") Integer id, Notificacoes notificacao) {
        
       
        Notificacoes notificacaoExistente = Notificacoes.findById(id);

        if (notificacaoExistente != null) {
            
            notificacaoExistente.tipo_notificacao = notificacao.tipo_notificacao;
            notificacaoExistente.mensagem = notificacao.mensagem;
            notificacaoExistente.data_notificacao = notificacao.data_notificacao;
            notificacaoExistente.status = notificacao.status;
            notificacaoExistente.clientes = notificacao.clientes;

            notificacaoExistente.persist();
        }
    }
}