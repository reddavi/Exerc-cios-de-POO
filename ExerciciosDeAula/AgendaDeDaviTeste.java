package ExerciciosDeAula;

import java.beans.Transient;


public class AgendaDeDaviTeste {
    @Test
    public void testaCadastraContato() throws ContatoJaExistenteException, ContatoNaoExistenteException{
        AgendaDeDavi agenda = new AgendaDeDavi();
        agenda.cadastraContato("demo","1234");
        Contato c = agenda.pesquisaContato("demo");
        assertTrue(c.getZap().equals("1234"));
        assertEquals("demo", c.getNome());


    }

    private void assertEquals(String string, String nome) {
    }

    private void assertTrue(boolean equals) {
    }
    
    
}
