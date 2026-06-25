public abstract class Peca {
    private String cor;
    private String codigo; 
    public Peca(String cor, String codigo) {
        this.cor = cor;
        this.codigo = codigo;
    }

    public String getCor() { return this.cor; }
    public String getCodigo() { return this.codigo; }

    public abstract void mover(); 
}
