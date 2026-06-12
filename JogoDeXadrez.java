public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador humano = new JogadorHumano('b'); // Brancas
        Jogador sintetico = new JogadorSintetico('p'); // Pretas

        System.out.println("Partida Iniciada!");

        // Loop corrigido chamando acouboOJogo() igual está no tabuleiro
        while (!tabuleiro.acouboOJogo()) {
            // Humano joga
            humano.jogar(tabuleiro, "P1b", 24);
            
            // Verifica se o jogo acabou após a jogada do humano
            if (tabuleiro.acouboOJogo()) break;

            // Sintético joga
            sintetico.jogar(tabuleiro, "P1p", 40);
        }
        
        System.out.println("Fim de jogo!");
    }

    public static void main(String[] args) {
        JogoDeXadrez partida = new JogoDeXadrez();
        partida.iniciar();

        System.out.println("\n=================================");
        System.out.println("Desenvolvido por: Emanuelle");
        System.out.println("=================================");
    }
}