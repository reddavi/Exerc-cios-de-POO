package Exercicio3;

public abstract class Mensagem {

    private String texto;
    private String emailRementente;
    private boolean anonima;

    protected Mensagem (String texto,String emailRementente,boolean anonima){
        this.texto = texto;
        this.emailRementente = emailRementente;
        this.anonima = anonima;  
    }

    protected String getNome() {
        return texto;
    }

    protected void setNome(String nome) {
        this.texto = nome;
    }

    protected String getEmailRementente() {
        return emailRementente;
    }

    protected void setEmailRementente(String emailRementente) {
        this.emailRementente = emailRementente;
    }
    protected boolean ehAnonima(){
        return this.anonima;
    }
    protected String getTexto(){
        return this.texto;
    }

    public Object getEmailDestinatario() {
        return null;
    }
    public abstract String getTextoCompletoAExibir();
           
}   
