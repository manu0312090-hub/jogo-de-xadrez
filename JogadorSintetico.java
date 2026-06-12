// JogadorSintetico.java
public class JogadorSintetico extends Jogador {
    public JogadorSintetico(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        // Implementação simulada da jogada da IA/Sintético
        System.out.println("Jogador Sintético (" + getCor() + ") movendo " + nomeDaPeca);
        return true;
    }
}