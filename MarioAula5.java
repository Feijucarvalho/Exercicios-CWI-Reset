public class MarioAula5 {



    private String nacionalidade;
    private String corOlhos;
    private String tamanho;
    private String corCabelo;
    private String poderes;
    private int stamina;
    private String nome;
    private int idade;
    private double altura;

    public MarioAula5(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.stamina = 100;
    }

    public MarioAula5(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.stamina = 100;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public void superMario () {
        System.out.println("Nome: "+this.nome+", Idade: "+this.idade+", Altura: "+this.altura+", Stamina: "+this.stamina);

    }

    public void superPoderes (){
        System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
    }

}

// fim Class - Inicio main

public class MarioAula5Main {
    public static void main(String[] args) {

        MarioAula5 m1 = new MarioAula5();
        MarioAula5 m2 = new MarioAula5();

        m1.setStamina(20);

        m1.perderStamina();
        m1.perderStamina();
        m1.perderStamina();


        m2.ganharStamina();
        m2.ganharStamina();
        m2.ganharStamina();

        m1.superMario();
        m1.superPoderes();

        m2.superMario();
        m2.superPoderes();

        System.out.println();


    }
}

//resposta no console

Nome: Mario Bros, Idade: 40, Altura: 1.5, Stamina: 0
Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar
Nome: Mario Bros, Idade: 40, Altura: 1.5, Stamina: 100
Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar
