public class Metodos {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC",0.5,"azul");
        Caneta c2 = new Caneta("ponta fina",0.6,"vermelha");
        c1.status();
        System.out.println();
        c2.status();
    }
}
