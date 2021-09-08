public class MarioMain {
        public static void main(String[] args) {
        Mario m1 = new Mario();
        m1.montarNoYoshi();
        m1.marioMontadoNoYoshi();
        Luigui l1 = new Luigui();
        l1.voar();
        Yoshi y1 = new Yoshi(0,10);
        y1.comerFruta();
        y1.comerFruta();
        y1.comerFruta();
        y1.comerFruta();
        y1.comerFruta();
        y1.imprimeDados();
        }
    }

// fim classe main - Inicio classe Personagem

public abstract class Personagem {

        private String nacionalidade;
        private String corOlhos;
        private String tamanho;
        private String corCabelo;
        private String poderes;
        private int stamina;
        private String nome;
        private int idade;
        private double altura;
        private int moedas;
        private int vidas;
        private double saltar;

    public double getSaltar() {
        return saltar;
    }

    public void setSaltar() {
        if (nome.equals("Mario")){
            this.saltar=1.5*this.altura;
        }else if (nome.equals("Luigui")){
            this.saltar = 2*this.altura;
        }
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
        this.setSaltar();
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

    public void crescer(){
            this.altura = this.altura * 2;

        }

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
            System.out.println("Nome: "+this.nome+", Idade: "+this.idade+" anos, Altura: "+this.altura+"m, Stamina: "+this.stamina+" Quantidade de vidas: "+this.vidas+" Qtd de Moedas: "+moedas+" Pode saltar "+this.saltar+"m.");

        }

        public void superPoderes (){
            System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
        }


}
