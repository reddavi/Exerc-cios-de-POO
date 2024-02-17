package Exercício2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestaAmigoGui {
    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();
        Random random = new Random();
        
        sistema.cadastrarAmigo("Ramo","Ramo@dcx.ufpb.br");
        sistema.cadastrarAmigo("Jazo","Jazo@dcx.ufpb.br");
        sistema.cadastrarAmigo("Bare","Bare@dcx.ufpb.br");
        sistema.cadastrarAmigo("Navi","Navi@dcx.ufpb.br");

        List<Amigo> amigosNaoSorteados = new ArrayList(sistema.getAmigos());


        for (int i = 0; i < sistema.getAmigos().size(); i++){
            int numeroAleatorio = random.nextInt(amigosNaoSorteados.size());
            sistema.getAmigos().get(i).setEmailAmigoSorteado(amigosNaoSorteados.get(numeroAleatorio).getEmail());
            amigosNaoSorteados.remove(numeroAleatorio);
        }

        for (Amigo amigo: sistema.getAmigos()){
            System.out.println(amigo);
        }

    }
}    

