public class Dama extends Peca {
    
    public Dama(String cor) {
        super(cor); 
    }

    @Override
    public void mover() {
        System.out.println("A dama se moveu em linha reta.");
    }
}