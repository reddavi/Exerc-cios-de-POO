package Exercício2;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente,  boolean anonima,String emailDestinatario){
        super(texto,emailRemetente,anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario(){
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if(super.ehAnonima()){
            return "Mensagem para" + this.emailDestinatario + ". Texto: " + super.getTexto();
        }else{
            return "Mensagem " + super.getEmailRementente()+ " para " + this.emailDestinatario;
        }
    }
}

