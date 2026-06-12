public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador humano = new JogadorHumano('b'); 
        Jogador sintetico = new JogadorSintetico('p'); 

        System.out.println("Partida Iniciada!");

       
        while (!tabuleiro.acouboOJogo()) {
        
            humano.jogar(tabuleiro, "P1b", 24);
            
            if (tabuleiro.acouboOJogo()) break;

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
