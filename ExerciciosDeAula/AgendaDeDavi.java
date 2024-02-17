package ExerciciosDeAula;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeDavi implements SistemaAgenda {
    // Mapa dos contatos onde a chave é o nome do contato.
    private Map<String,Contato> contatos;     

    public AgendaDeDavi(){
        this.contatos = new HashMap<>();
    }

    @Override
    public void cadastraContato(String nome, String zap) throws ContatoJaExistenteException {
        Contato c = this.contatos.get(nome);
        if(c==null){
            c = new Contato(nome, zap);
            this.contatos.put(nome, c);     
        }else {
            throw new ContatoJaExistenteException("Já Exite o contato com o nome cadastrado.");
        }
        
    }
    @Override
    public Contato pesquisaContato(String nome) throws ContatoNaoExistenteException {
        if(this.contatos.containsKey(nome)){
            return this.contatos.get(nome);
        }else {
            throw new ContatoNaoExistenteException("Não existe o contato com este nome.");
        }
    }   
}
