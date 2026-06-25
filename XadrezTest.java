import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XadrezTest {

    @Test
    public void testeCasaLivre() {
        Tabuleiro tabuleiro = new Tabuleiro();
      
        tabuleiro.colocarPeca(new Torre("Branco", "TBR"), 0, 0);

        assertTrue(tabuleiro.casaLivre("b3"), "A casa b3 deveria estar livre.");

        assertTrue(!tabuleiro.casaLivre("a1"), "A casa a1 deveria estar ocupada.");
    }
}
