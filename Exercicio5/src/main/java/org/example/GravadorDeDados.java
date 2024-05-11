package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVO_CONTATOS = "contatos.txt";

    public Map<String, Contato> recuperarContatos() throws RecuperacaoContatosException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS));
            return (Map<String, Contato>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RecuperacaoContatosException("Não foi possível recuperar os contatos");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public void salvarContatos(Map<String, Contato> contatos) throws SalvarContatosException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_CONTATOS));
            out.writeObject(contatos);
        } catch (IOException e) {
            throw new SalvarContatosException("Erro ao salvar os contatos no arquivo " + ARQUIVO_CONTATOS);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
    }
}