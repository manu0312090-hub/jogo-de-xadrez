public class Cavalo extends Peca {
    
    public Cavalo(String cor) {
        super(cor);
    }

    @Override
    public void mover() {
        System.out.println("O cavalo se moveu em linha reta.");
    }
}