package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SistemaContatos implements interfaceContatos {
    private GravadorDeDados gravador = new GravadorDeDados();
    private Map<String, Contato> contatos;

    public SistemaContatos() {
        contatos = new HashMap<>();
        recuperaDados();
    }

    public void salvarDados() {
        try {
            this.gravador.salvarContatos(this.contatos);
        } catch (SalvarContatosException e) {
            System.err.println(e.getMessage());
        }
    }

    public void recuperaDados() {
        try {
            this.contatos = this.gravador.recuperarContatos();
        } catch (RecuperacaoContatosException e) {
            System.err.println(e.getMessage());
        }
    }

    public void cadastraContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        contatos.put(nome, contato);
        salvarDados();
    }

    public Contato pesquisarContato(String nome) throws contatoInexistenteException {
        if (contatos.containsKey(nome)) {
            return contatos.get(nome);
        } else {
            throw new contatoInexistenteException("Contato não encontrado");
        }
    }

    @Override
    public boolean removerContato(String nome) {
        if(this.contatos.containsKey(nome)){
            this.contatos.remove(nome);
            System.out.println(nome + " removido com sucesso do estoque!!");
            return true;
        }else {
            return false;
        }
    }

    public List<Contato> exibirTodosContatos() {
        return new LinkedList<>(contatos.values());
    }
}






