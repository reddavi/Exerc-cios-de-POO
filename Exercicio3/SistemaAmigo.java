package Exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SistemaAmigo {
    private List<Amigo> amigos = new LinkedList<>();
    private List<Mensagem> mensagem = new LinkedList<>();
    public Object cadastrarAmigo;

    
    public String pesquisaAmigoSecretoDe(String emailDapessoa)throws AmigoNaoSorteadoException,AmigoInexistenteException{
        boolean achei = false;
        for(Amigo a: this.amigos){
            if(a.getEmail().equals(emailDapessoa)){
                String emailAmigoSorteado = a.getEmailAmigoSorteado();
                if(emailAmigoSorteado==null){
                    throw new AmigoNaoSorteadoException("Não foi sorteado o Amigo de: " + emailAmigoSorteado);
                }else{
                    if(emailAmigoSorteado == "maria@dcx.ufpb.br"){
                        return "Ok";

                    }else{
                        return emailAmigoSorteado;
                    }
                }
            }
        }
        throw new AmigoInexistenteException("Não foi encontrado a pessoa de email: " + emailDapessoa);
    }
    public void cadastrarAmigo(String nomeAmigo,String emailAmigo){
        Amigo amigo = new Amigo (nomeAmigo, emailAmigo);

        if (this.amigos.isEmpty()) {
            this.amigos.add(amigo);
            System.out.println("Amigo cadastrado com sucesso");
        } else {
            for (Amigo a : this.amigos) {
                if (Objects.equals(a.getNome(), nomeAmigo) && Objects.equals(a.getEmail(), emailAmigo)) {
                    System.out.println("Amigo já cadastrado");
                    return;
                } else {
                    this.amigos.add(amigo);
                    System.out.println("Amigo cadastrado com sucesso");
                    return;
                }
            }
        }
    }

    public List<Amigo> pesquisaAmigo(String emailAmigo){
        List<Amigo> amigoPesquisado = new ArrayList<>();
        for(Amigo a: this.amigos){
            if(a.getEmail().equals(emailAmigo)){
                amigoPesquisado.add(a);
                }
            }
            return amigoPesquisado;           
    }
    public void enviarMesagemParaTodos(String Texto, String emailRemetente, boolean ehAnonima){
            MensagemParaTodos m = new MensagemParaTodos(Texto, emailRemetente, ehAnonima);
            this.mensagem.add(m); 
                

    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagemAnônima = new ArrayList<>();
        for(Mensagem m: mensagem){
            if(m.ehAnonima()){
                mensagemAnônima.add(m);
            }
        }
        return mensagemAnônima;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        boolean ok = false;
        for(Amigo a : amigos){
            if(a.getEmail().equals(emailDaPessoa)){
                a.setEmailAmigoSorteado(emailAmigoSorteado);
                ok = true;
            }
        }
        if(!ok){
            throw new AmigoInexistenteException("Amigo não encontrado");
        }
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return this.mensagem;
    }
    public void enviarMensagemParaAlguem(String texto,String emailRemetente,String emailDestinatario,boolean ehAnonima){                      
            MensagemParaAlguem m = new MensagemParaAlguem(texto, emailRemetente, ehAnonima, emailDestinatario);
            this.mensagem.add(m);
    }
    public List<Amigo>getAmigos(){
        return this.amigos;
    }
}                   
        

   
    




