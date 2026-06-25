public class Tabuleiro {
    private Peca[][] casas;

    public Tabuleiro() {
        this.casas = new Peca[8][8];
    }

    public Boolean casaLivre(String casa) {
        if (casa == null || casa.length() != 2) return false;
        
       
        int coluna = casa.charAt(0) - 'a'; 
        int linha = Character.getNumericValue(casa.charAt(1)) - 1; 

        if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
            return false;
        }

        return casas[linha][coluna] == null;
    }
    public void colocarPeca(Peca peca, int linha, int coluna) {
        this.casas[linha][coluna] = peca;
    }

    public void exibir() {
        System.out.println("\n   a   b   c   d   e   f   g   h");
        for (int i = 7; i >= 0; i--) { 
            System.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] == null) {
                    System.out.print("[   ]");
                } else {
                    System.out.print("[" + casas[i][j].getCodigo() + "]");
                }
            }
            System.out.println(" " + (i + 1));
        }
        System.out.println("   a   b   c   d   e   f   g   h\n");
    }

    public boolean moverPecaPorCodigo(String codigoPeca, String casaDestino) {
        int colDestino = casaDestino.charAt(0) - 'a';
        int linDestino = Character.getNumericValue(casaDestino.charAt(1)) - 1;

        int linAtual = -1, colAtual = -1;
        Peca pecaParaMover = null;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] != null && casas[i][j].getCodigo().equalsIgnoreCase(codigoPeca)) {
                    pecaParaMover = casas[i][j];
                    linAtual = i;
                    colAtual = j;
                    break;
                }
            }
        }

        if (pecaParaMover == null) {
            System.out.println("Peça não encontrada no tabuleiro!");
            return false;
        }

        if (!casaLivre(casaDestino)) {
            System.out.println("Não pode mover a peça porque já existe outra peça na casa de destino.");
            return false;
        }

        casas[linDestino][colDestino] = pecaParaMover;
        casas[linAtual][colAtual] = null;
        return true;
    }
}
