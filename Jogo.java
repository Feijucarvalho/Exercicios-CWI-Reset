public class Personagem {



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


        public Personagem(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.stamina = 100;
            this.moedas = 0;
            this.vidas = 1;
            this.setSaltar();
        }

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

//fim da classe Personagem - Inicio Classe jogo


import java.util.Random;

public class Jogo {

    private Personagem jogador1;
    private Personagem jogador2;


    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public Personagem getJogador1() {
        return jogador1;
    }

    public void setJogador1(Personagem jogador1) {
        this.jogador1 = jogador1;
    }

    public Personagem getJogador2() {
        return jogador2;
    }

    public void setJogador2(Personagem jogador2) {
        this.jogador2 = jogador2;
        ;
    }

    public void jogar() {
        Random coletar = new Random();
        int jogador1Coletando = coletar.nextInt(30);
        for (int i = 0; i <= jogador1Coletando; i++) {
            jogador1.coletaMoedas();

        }

        int jogador2Coletando = coletar.nextInt(30);
        for (int i = 0; i <= jogador2Coletando; i++) {
            jogador2.coletaMoedas();

        }

            System.out.println("----------------------------------------------");
            System.out.println("Os dados do primeiro jogador sao: " + this.jogador1.getNome());
            System.out.println("Nome " + this.jogador1.getNome());
            System.out.println("Altura " + this.jogador1.getAltura());
            System.out.println("Idade " + this.jogador1.getIdade());
            System.out.println("Quantidade de moedas coletadas" + jogador1.getMoedas());
            System.out.println("Quantidade de vidas" + this.jogador1.getVidas());

            System.out.println("----------------------------------------------");
            System.out.println("Os dados do primeiro jogador sao: " + this.jogador2.getNome());
            System.out.println("Nome " + this.jogador2.getNome());
            System.out.println("Altura " + this.jogador2.getAltura());
            System.out.println("Idade " + this.jogador2.getIdade());
            System.out.println("Quantidade de moedas coletadas" + jogador2.getMoedas());
            System.out.println("Quantidade de vidas" + this.jogador2.getVidas());
        }
    }

// fim da classe jogo - Inicio Classe main

public class MarioEncapsulamento {
        public static void main(String[] args) {

            Personagem mario = new Personagem("Mario",40,1.5);
            Personagem luigui = new Personagem("Luigui",35,1.75);

            Jogo SM = new Jogo(mario,luigui);
            SM.jogar();

// Resposta no console
            
            ----------------------------------------------
Os dados do primeiro jogador sao: Mario
Nome Mario
Altura 1.5
Idade 40
Quantidade de moedas coletadas1
Quantidade de vidas1
----------------------------------------------
Os dados do primeiro jogador sao: Luigui
Nome Luigui
Altura 1.75
Idade 35
Quantidade de moedas coletadas19
Quantidade de vidas2
