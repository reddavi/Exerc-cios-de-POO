import org.example.Contato;
import org.example.SistemaContatos;
import org.example.contatoInexistenteException;
import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaContatosTest {

    @Test
    public void testCadastrarContato() throws contatoInexistenteException {
        SistemaContatos sistema = new SistemaContatos();
        sistema.cadastraContato("Davi", 4002);
        Contato contato = sistema.pesquisarContato("Davi");
        assertEquals("Davi", contato.getNome());
        assertEquals(4002, contato.getNumero());
    }

    @Test
    public void testPesquisarContato() throws contatoInexistenteException {
        SistemaContatos sistema = new SistemaContatos();
        sistema.cadastraContato("Davi", 4002);
        Contato contato = sistema.pesquisarContato("Davi");
        assertEquals("Davi", contato.getNome());
        assertEquals(4002, contato.getNumero());
    }

    @Test
    public void testExibirTodosContatos() {
        SistemaContatos sistema = new SistemaContatos();
        sistema.cadastraContato("Davi", 4002);
        sistema.cadastraContato("Ana", 123);
        List<Contato> contatos = sistema.exibirTodosContatos();
        assertEquals(2, contatos.size());
        assertTrue(contatos.stream().anyMatch(c -> c.getNome().equals("Davi")));
        assertTrue(contatos.stream().anyMatch(c -> c.getNome().equals("Ana")));
    }
}