package Exercício2;
public class MensagemParaTodos extends Mensagem {
   public MensagemParaTodos(String texto, String emailRemetente, boolean anonima){
    super(texto, emailRemetente, anonima);
   }

@Override
public String getTextoCompletoAExibir() {
       if(super.ehAnonima()){
        return "Mensagem para todos. Texto: " + super.getTexto();
    }else{
        return "Mesagem de"+super.getEmailRementente()+ "para Todos. Texto: "+super.getTexto();
    
        }
    } 
}
