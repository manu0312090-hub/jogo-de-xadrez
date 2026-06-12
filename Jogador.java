public abstract class Jogador implements JogadorInterface {
    private char cor;

    public Jogador(char cor) {
        if (cor != 'b' && cor != 'p') {
            throw new IllegalArgumentException("A cor deve ser 'b' (branca) ou 'p' (preta).");
        }
        this.cor = cor;
    }

    public char getCor() {
        return cor;
    }
}