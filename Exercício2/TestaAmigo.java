package Exercício2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaAmigo {
    public static void main(String[] args) {
    List<Amigo> lista = new LinkedList<>();
    lista.add(new Amigo("Ramo","Ravi@dcx.ufpb.br"));
    lista.add(new Amigo("Jazo","Javi@dcx.ufpb.br"));
    lista.add(new Amigo("Bare","Bavi@dcx.ufpb.br"));
    lista.add(new Amigo("Navi","Navi@dcx.ufpb.br"));

    System.out.println("Lista desordenada: ");
    for(Amigo a:lista){
        System.out.println("Nome: "+ a.getNome());
    }
    System.out.println("Lista ordenada");
    Collections.sort(lista);
    for(Amigo a:lista){
        System.out.println("Nome: "+ a.getNome());
    }
    }       
}
