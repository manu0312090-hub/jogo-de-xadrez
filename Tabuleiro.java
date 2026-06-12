public class Tabuleiro {
    private String[][] casas = new String[8][8];
    private int jogadasSimuladas = 0; // Controle para o loop não ser infinito no teste

    public Tabuleiro() {
        // 1. Inicializa a matriz com três espaços em branco
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }
        
        // 2. Coloca as peças
        colocarPecas();
        
        // 3. Mostra o tabuleiro
        mostrar();
    }

    private void colocarPecas() {
        // Pretas (Linhas 0 e 1)
        casas[0][0] = "T1p"; casas[0][1] = "H1p"; casas[0][2] = "B1p"; casas[0][3] = "Q0p";
        casas[0][4] = "K0p"; casas[0][5] = "B2p"; casas[0][6] = "H2p"; casas[0][7] = "T2p";
        for (int j = 0; j < 8; j++) casas[1][j] = "P" + (j + 1) + "p";

        // Brancas (Linhas 6 e 7)
        for (int j = 0; j < 8; j++) casas[6][j] = "P" + (j + 1) + "b";
        casas[7][0] = "T1b"; casas[7][1] = "H1b"; casas[7][2] = "B1b"; casas[7][3] = "Q0b";
        casas[7][4] = "K0b"; casas[7][5] = "B2b"; casas[7][6] = "H2b"; casas[7][7] = "T2b";
    }

    public void mostrar() {
        System.out.println("---------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                System.out.print(casas[i][j] + "|");
            }
            System.out.println("\n---------------------------------");
        }
    }

    // Nome alterado para bater exatamente com o enunciado e com o JogoDeXadrez
    public boolean acouboOJogo() {
        jogadasSimuladas++;
        return jogadasSimuladas > 4; 
    }
}