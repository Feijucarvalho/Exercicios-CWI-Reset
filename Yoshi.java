public class Yoshi extends Personagem {

    private int qtdFrutasComidas;
    private int velocidade;
    private double altura;

    public void saltar(double altura){
        System.out.println("Yoshi esta pulando "+1.5*altura);
    }

    public void saltar(String obstaculo){
        if (obstaculo.equals("obstaculo")){
            System.out.println("Yoshi está pulando 50% mais alto que obstaculo a sua frente");
        }

    }

    public Yoshi(int qtdFrutasComidas, int velocidade) {
        this.qtdFrutasComidas = qtdFrutasComidas;
        this.velocidade = velocidade;
        this.qtdFrutasComidas = 0;
        this.velocidade = 10;
    }

    public Yoshi(double altura) {
        this.altura = altura;
    }

    public int getQtdFrutasComidas() {
        return qtdFrutasComidas;
    }

    public void setQtdFrutasComidas(int qtdFrutasComidas) {
        this.qtdFrutasComidas = qtdFrutasComidas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void comerFruta() {
        qtdFrutasComidas++;
        if (qtdFrutasComidas % 2 == 0) {
            this.setVelocidade(getVelocidade() * 2);
        }

}
    public void imprimeDados(){
        System.out.println("Yoshi comeu "+this.qtdFrutasComidas +" frutas");
        System.out.println("A velovidade do Yoshi é de "+this.velocidade);
    }

    @Override
    public void crescer() {
        this.altura = (this.altura * 1.1);
        System.out.println("A altura atual é do Yoshi é de: "+this.altura);
    }
}
