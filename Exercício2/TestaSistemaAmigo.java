package Exercício2;

public class TestaSistemaAmigo {
    public static void main(String[] args) throws AmigoInexistenteException,AmigoNaoSorteadoException {
        SistemaAmigo sistema = new SistemaAmigo();

        sistema.cadastrarAmigo("José", "joselito@dcx.ufpb.br");
        sistema.cadastrarAmigo("José", "joselito@dcx.ufpb.br");
        sistema.cadastrarAmigo("Maria", "maria@dcx.ufpb.br");

        sistema.configuraAmigoSecretoDe("joselito@dcx.ufpb.br", "maria@dcx.ufpb.br");
        sistema.configuraAmigoSecretoDe("maria@dcx.ufpb.br", "joselito@dcx.ufpb.br");

        sistema.enviarMensagemParaAlguem("Lindo", "maria@dcx.ufpb.br", "joselito@dcx.ufpb.br", true);
        sistema.enviarMesagemParaTodos("Amo josé", "maria@dcx.ufpb.br", true);

        for(Mensagem m:sistema.pesquisaMensagensAnonimas()){
            System.out.println(m.getTextoCompletoAExibir());
        }

        System.out.println(sistema.pesquisaAmigoSecretoDe("joselito@dcx.ufpb.br"));
        
    }
}
