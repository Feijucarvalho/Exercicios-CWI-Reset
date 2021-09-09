public class Mario extends Personagem{
    private int yoshi;
    private double altura;


    public void saltar(double altura){
        System.out.println("Mario esta pulando "+1.5*altura);
    }

    public void saltar(String obstaculo){
        if (obstaculo.equals("obstaculo")){
            System.out.println("Mario está pulando 50% mais alto que obstaculo a sua frente");
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

    public Mario(double altura) {
        this.altura = altura;
    }

    @Override
    public void crescer() {
        this.altura = (this.altura * 1.5);
        System.out.println("A altura atual é do Mario é de: "+this.altura);
    }

    public int getYoshi() {
        return yoshi;
    }

    public void setYoshi(int yoshi) {
        this.yoshi = yoshi;
    }

    public void montarNoYoshi(){
        yoshi =+1;
    }
    public void marioMontadoNoYoshi(){
        if (this.yoshi == 0){
            System.out.println("Mario nao está montado no yoshi");
        }else{
            System.out.println("Mario esta montado no Yoshi");
        }
    }

}
