package Formas;

public abstract class Forma {

    private String nome;
    
    public Forma(String nome) {
        this.nome = nome;
    }
    
    public abstract void desenhar();
    
    public abstract boolean pertence(double x, double y);
    
    public String getNome() {
        return nome;
    }
}
