package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuContatosGUI extends JFrame {

    private SistemaContatos listaDeContatos;

    public MenuContatosGUI() {
        super("Menu de Contatos");
        listaDeContatos = new SistemaContatos();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton adicionarButton = new JButton("Adicionar Contato");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Digite o nome do contato:");
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do contato:"));
                listaDeContatos.cadastraContato(nome, numero);
                JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
            }
        });
        panel.add(adicionarButton);

        JButton pesquisarButton = new JButton("Pesquisar Contato");
        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Digite o nome do contato a ser pesquisado:");
                Contato contatoEncontrado = null;
                try {
                    contatoEncontrado = listaDeContatos.pesquisarContato(nome);
                } catch (contatoInexistenteException ex) {
                    throw new RuntimeException(ex);
                }
                if (contatoEncontrado != null) {
                    JOptionPane.showMessageDialog(null, "Contato encontrado:\nNome: " + contatoEncontrado.getNome() + "\nNúmero: " + contatoEncontrado.getNumero());
                } else {
                    JOptionPane.showMessageDialog(null, "Contato não encontrado.");
                }
            }
        });
        panel.add(pesquisarButton);

        JButton exibirButton = new JButton("Exibir Todos os Contatos");
        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder contatosString = new StringBuilder("Lista de Contatos:\n");
                for (Contato c : listaDeContatos.exibirTodosContatos()) {
                    contatosString.append("Nome: ").append(c.getNome()).append(", Número: ").append(c.getNumero()).append("\n");
                }
                JOptionPane.showMessageDialog(null, contatosString.toString());
            }
        });
        panel.add(exibirButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
        JButton removerButton = new JButton("Remover Contato");
        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Digite o nome do contato a ser removido:");
                listaDeContatos.removerContato(nome);
                JOptionPane.showMessageDialog(null, "Contato removido com sucesso!");
            }
        });
        panel.add(removerButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuContatosGUI();
            }
        });
    }
}