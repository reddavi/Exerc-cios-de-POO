package ExerciciosDeAula;

import javax.swing.JOptionPane;

public class ProgramaContato {
    public static void main(String[] args) {
    SistemaAgenda agenda = new AgendaDeDavi();
    boolean continuar = true;
    while(continuar){
        String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Pesquisar contato\n3.Sair");
        switch(opcao){
            case "1" ->{
                String nome = JOptionPane.showInputDialog("Digite o nome: ");
                String zap = JOptionPane.showInputDialog("Digite seu zap: ");
                try{
                    agenda.cadastraContato(nome, zap);
                    JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");
                }catch(ContatoJaExistenteException e){
                    JOptionPane.showMessageDialog(null, "Contato com este nome já existente! ");
                    System.err.println("Detalhes: "+ e.getMessage());
                    e.printStackTrace();
                }
            }
            case "2" ->{
                String nomePesquisado = JOptionPane.showInputDialog("Qual contato deseja pesquisa? ");
                try{
                   Contato c = agenda.pesquisaContato(nomePesquisado);
                   JOptionPane.showMessageDialog(null,"Contato encontrado com sucesso!");
                   JOptionPane.showMessageDialog(null,"O contato de "+ nomePesquisado+" é "+ c.getZap() );
 
                }catch(ContatoNaoExistenteException e){
                    JOptionPane.showMessageDialog(null,"Contato não encontrado! ");
                    System.err.println("Detalhes: ");
                    e.printStackTrace();
                }
            }
            case "3" ->{
                JOptionPane.showMessageDialog(null, "Até mais ver! ");
                continuar = false;
                }
            };            
        }
    }
}
