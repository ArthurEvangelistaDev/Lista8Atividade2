public class Quadrado {

    double lado;

    public void setLado(double novoLado) {
        lado = novoLado;
    }

    public void getLado() {
        System.out.println("Valor do lado: " + lado);
    }

    public void calculaArea() {
        System.out.println("A área do seu quadrado é: " + (lado * lado));
    }

}
