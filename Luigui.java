public class Luigui extends Personagem{

    private double altura;

    public void saltar(double altura){
        System.out.println("Luigui esta pulando "+1.5*altura);
    }

    public void saltar(String obstaculo){
        if (obstaculo.equals("obstaculo")){
            System.out.println("Luigui está pulando 50% mais alto que obstaculo a sua frente");
        }

    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Luigui(double altura) {
        this.altura = altura;
    }

    public void voar(){
        System.out.println("Luigui está voando");
    }

    @Override
    public void crescer() {
        this.altura = (this.altura * 1.75);
        System.out.println("A altura atual é do Luigui é de: "+this.altura);
    }
    }
