package Formas;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo", 5.0);
        Retangulo retangulo = new Retangulo("Retângulo", 10.0, 8.0);
        
        System.out.println("Nome do círculo: " + circulo.getNome());
        System.out.println("Nome do retângulo: " + retangulo.getNome());
        
        circulo.desenhar();
        retangulo.desenhar();
    }
}
