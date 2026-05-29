public class Bispo extends Peca {
    
    public Bispo(String cor) {
        super(cor);
    }

    @Override
    public void mover() {
        System.out.println("O bispo se moveu em linha reta.");
    }
}
