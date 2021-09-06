public class Personagem implements Controlador {



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
        if (nome=="Mario"){
            this.saltar=1.5*this.altura;
        }else if (nome == "Luigui"){
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

    @Override
    public void morrer() {
            this.setStamina(0);
            this.vidas = this.vidas - 1;
            if (this.vidas < 0 ){
                this.vidas = 0;
            }else{
                this.setStamina(100);
            }

    }
    @Override
    public void revigorar() {
            this.stamina = 100;

    }

    @Override
    public void colelaMoedas() {
            this.moedas = this.moedas + 1;
            if (this.moedas % 10 == 0){
                this.vidas = this.vidas + 1;
            }

    }

    public void superMario () {
            System.out.println("Nome: "+this.nome+", Idade: "+this.idade+" anos, Altura: "+this.altura+"m, Stamina: "+this.stamina+" Quantidade de vidas: "+this.vidas+" Qtd de Moedas: "+moedas+" Pode saltar "+this.saltar+"m");

        }

        public void superPoderes (){
            System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
        }


}

// fim classe Personagem - Inicio classe main

public class MarioEncapsulamento {
        public static void main(String[] args) {

            Personagem mario = new Personagem("Mario",40,1.5);
            Personagem luigui = new Personagem("Luigui",35,1.75);

            mario.superMario();
            mario.superPoderes();

            luigui.superMario();
            luigui.superPoderes();

            System.out.println();


        }
    }

// Resposta no console

Nome: Mario, Idade: 40 anos, Altura: 1.5m, Stamina: 100 Quantidade de vidas: 1 Qtd de Moedas: 0 Pode saltar 2.25m
Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar
Nome: Luigui, Idade: 35 anos, Altura: 1.75m, Stamina: 100 Quantidade de vidas: 1 Qtd de Moedas: 0 Pode saltar 3.5m
Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar
