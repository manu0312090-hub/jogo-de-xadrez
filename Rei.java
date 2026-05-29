public class Rei extends Peca {
    
    public Rei(String cor) {
        super(cor); // Passa a cor para a classe mãe
    }

    @Override
    public void mover() {
        System.out.println("O Rei se moveu em linha reta.");
    }
}