package Formas;

public class Retangulo extends Forma {
	
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo de largura " + largura + " e altura " + altura);
    }
    
    @Override
    public boolean pertence(double x, double y) {
		// TODO Auto-generated method stub
		// Retorne true se o ponto pertence a forma, caso contrario
        return false;
    }

}
