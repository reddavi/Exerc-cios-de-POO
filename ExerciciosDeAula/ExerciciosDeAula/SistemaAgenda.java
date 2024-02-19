package ExerciciosDeAula;

public interface SistemaAgenda {
    public void cadastraContato (String nome,String zap) throws ContatoJaExistenteException;
    public Contato pesquisaContato(String nome) throws ContatoNaoExistenteException; 
    
}
