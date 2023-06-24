public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado();

        quadrado.lado = 2;

        quadrado.getLado();

        quadrado.calculaArea();

        quadrado.setLado(4);
        quadrado.calculaArea();
    }
}
