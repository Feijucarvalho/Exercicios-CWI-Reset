public class MarioAula10 {
        public static void main(String[] args) {


        Mario m = new Mario(1.5);
        m.crescer();
        Luigui l = new Luigui(1.7);
        l.crescer();
        Yoshi y = new Yoshi(1.2);
        y.crescer();
        m.saltar(1.5);
        l.saltar(1.7);
        y.saltar(1.2);
        m.saltar("obstaculo");
        l.saltar("obstaculo");
        y.saltar("obstaculo");
        }
    }

// Fim da classe principal - Inicio da classe abstrata personagem

public abstract class Personagem {

        private String nacionalidade;
        private String corOlhos;
        private String tamanho;
        private String corCabelo;
        private String poderes;
        private int stamina;
        private String nome;
        private int idade;
        protected double altura;
        private int moedas;
        private int vidas;
        protected double crescer;

    public double getCrescer() {
        return crescer;
    }

    public void setCrescer(double crescer) {
        this.crescer = crescer;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void perderStamina(){
            this.stamina = this.stamina - 10;
            if (this.stamina < 0){
                this.stamina = 0;
            }
        }

        public void ganharStamina(){
            this.stamina = this.stamina +5;
            if (this.stamina>100){
                this.stamina = 100;
            }
        }

    public abstract void crescer();

    public void morrer() {
            this.setStamina(0);
            this.vidas = this.vidas - 1;
            if (this.vidas < 0 ){
                this.vidas = 0;
            }else{
                this.setStamina(100);
            }

    }

    public void revigorar() {
            this.stamina = 100;

    }

    public void coletaMoedas() {
        this.moedas++;

        if (this.moedas % 10 == 0) {
            this.vidas++;
        }
    }


    public void superMario () {
            System.out.println("Nome: "+this.nome+", Idade: "+this.idade+" anos, Altura: "+this.altura+"m, Stamina: "+this.stamina+" Quantidade de vidas: "+this.vidas+" Qtd de Moedas: "+moedas+" Pode saltar ");

        }

        public void superPoderes (){
            System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
        }


}

// fim da classe abstrata personagem - inicio da classe Mario

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

// fim da classe Mario - inicio da classe Luigui

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

//Fim da classe Luigui - Inicio da classe Yoshi

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

// fim da classe Yoshi - Inicio da resposta no console


