public class Peao extends Peca {
    
    public Peao(String cor) {
        super(cor); // Passa a cor para a classe mãe
    }

    @Override
    public void mover() {
        System.out.println("O peao se moveu em linha reta.");
    }
}