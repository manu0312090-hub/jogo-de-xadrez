import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();

        tabuleiro.colocarPeca(new Torre("Branco", "TBR"), 0, 0); 
        tabuleiro.colocarPeca(new Torre("Branco", "TBR"), 0, 7); 
        tabuleiro.colocarPeca(new Torre("Preto", "TPR"), 7, 0);  
        tabuleiro.colocarPeca(new Torre("Preto", "TPR"), 7, 7); 
        
    
        tabuleiro.colocarPeca(new Peao("Branco", "PBR"), 1, 0); // a2
        tabuleiro.colocarPeca(new Peao("Preto", "PPR"), 6, 0);  // a7

        boolean jogando = true;

        while (jogando) {
        
            tabuleiro.exibir();

            System.out.println("Qual peça você quer mover?");
            String peca = scanner.next();

            System.out.println("Para qual casa você deseja mover?");
            String casa = scanner.next();

            boolean sucesso = tabuleiro.moverPecaPorCodigo(peca, casa);
            
            if (sucesso) {
                tabuleiro.exibir();
                
                System.out.println("Deseja continuar jogando? (SIM/NÃO)");
                String resposta = scanner.next();
                
                if (resposta.equalsIgnoreCase("NÃO") || resposta.equalsIgnoreCase("NAO")) {
                    jogando = false;
                    System.out.println("Jogo encerrado.");
                }
            }
        }
        scanner.close();
    }
}
