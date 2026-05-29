public class Tabuleiro {
    private Peca[][] casas;

    public Tabuleiro() {
        this.casas = new Peca[8][8];
    }

    public void colocarPeca(Peca peca, int linha, int coluna) {
        this.casas[linha][coluna] = peca;
    }
}