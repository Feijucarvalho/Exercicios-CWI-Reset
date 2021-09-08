public class Yoshi extends Personagem {

    private int qtdFrutasComidas;
    private int velocidade;

    public Yoshi(int qtdFrutasComidas, int velocidade) {
        this.qtdFrutasComidas = qtdFrutasComidas;
        this.velocidade = velocidade;
        this.qtdFrutasComidas = 0;
        this.velocidade = 10;
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

}
