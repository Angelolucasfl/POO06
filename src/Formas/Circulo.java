package Formas;

public class Circulo extends Forma {
	
	private double raio;
    
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

	@Override
	public void desenhar() {
		System.out.println("Desenhando um círculo de raio " + raio);	
	}

	@Override
	public boolean pertence(double x, double y) {
		// TODO Auto-generated method stub
		// Retorne true se o ponto pertence a forma, caso contrario
		return false;
	}

}
