package org.example;

import java.util.List;

public interface interfaceContatos {
    public void cadastraContato(String nome,int numero);
    Contato pesquisarContato(String nome)throws contatoInexistenteException ;
    public boolean removerContato(String nome);
    public List<Contato>exibirTodosContatos();

}
