package Exercício2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
public class SistemaAmigoMap {
    private Map<String, Amigo> amigos = new HashMap<>();
    private Map<String, Mensagem> mensagem = new HashMap<>();

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo);
        if (this.amigos.containsKey(emailAmigo)) {
            throw new AmigoJaExisteException("Amigo ja foi cadastrado");
        }
        this.amigos.put(emailAmigo, amigo);
        System.out.println("Amigo cadastrado com sucesso!!!");
    }

    public Amigo pesquisaAmigo(String email) throws AmigoInexistenteException {
        if (this.amigos.containsKey(email)) {
            return this.amigos.get(email);
        } else {
            throw new AmigoInexistenteException("Amigo não existe! ");
        }

    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        if (pesquisaAmigo(emailDaPessoa) != null) {
            this.amigos.get(emailDaPessoa).setEmailAmigoSorteado(emailAmigoSorteado);
        }
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException {        
        String emaildAmigoSecreto = "";
        
        if (pesquisaAmigo(emailDaPessoa) != null){
            emaildAmigoSecreto = this.amigos.get(emailDaPessoa).getEmailAmigoSorteado();
        }
        return emaildAmigoSecreto;
    }
    public void enviarMensagemParaTodos(String Texto, String emailRemetente, boolean ehAnonima){
        Mensagem m = new MensagemParaTodos(Texto,emailRemetente,ehAnonima);
           this.mensagem.put(emailRemetente,m);
    }
    public void enviarmensagemParaAlguem(String texto,String emailRemetente,String emailDestinatario,boolean ehAnonima){
        Mensagem m = new MensagemParaAlguem(texto,emailRemetente,ehAnonima,emailDestinatario);
        this.mensagem.put(emailRemetente,m);
    }
    public List<Mensagem>pesquisaMensagemAnonima(){
        List<Mensagem> mensagemAnônima = new ArrayList<>();
        for(Mensagem m: mensagem.values()){
            if(m.ehAnonima()){
                mensagemAnônima.add(m);
            }
        }
        return mensagemAnônima;
    }                                   
    public Map<String, Amigo> getAmigos() {
        return amigos;
    }
}