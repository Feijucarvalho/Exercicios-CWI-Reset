public class MarioAula6 implements Controlador {



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

        public MarioAula6(){
            this.nome = "Mario Bros";
            this.idade = 40;
            this.altura = 1.50;
            this.stamina = 100;
            this.moedas = 0;
            this.vidas = 1;
        }

        public MarioAula6(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.stamina = 100;
            this.moedas = 0;
            this.vidas = 1;
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
            System.out.println("Nome: "+this.nome+", Idade: "+this.idade+", Altura: "+this.altura+", Stamina: "+this.stamina+" Quantidade de vidas: "+this.vidas+" Qtd de Moedas: "+moedas);

        }

        public void superPoderes (){
            System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
        }


}

