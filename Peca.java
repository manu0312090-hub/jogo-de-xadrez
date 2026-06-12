
public abstract class Peca {
    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}

class Rei extends Peca {
    public Rei(String nome) {
        super(nome); 
    }
}

class Rainha extends Peca {
    public Rainha(String nome) {
        super(nome);
    }
}

class Torre extends Peca {
    public Torre(String nome) {
        super(nome);
    }
}

class Bispo extends Peca {
    public Bispo(String nome) {
        super(nome);
    }
}

class Cavalo extends Peca {
    public Cavalo(String nome) {
        super(nome);
    }
}

class Peao extends Peca {
    public Peao(String nome) {
        super(nome);
    }
}