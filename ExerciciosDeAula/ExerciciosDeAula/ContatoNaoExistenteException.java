package ExerciciosDeAula;

public class ContatoNaoExistenteException extends Exception{
    public ContatoNaoExistenteException(String msg){
        super(msg);
    }
    public ContatoNaoExistenteException(){
        this("Problema de contato que não existe");
    }
}
