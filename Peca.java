public abstract class Peca {
    private String cor; 

    public Peca(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public abstract void mover(); 
}