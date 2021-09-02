public class Mario {



    private String nacionalidade;
    private String corOlhos;
    private String tamanho;
    private String corCabelo;
    private String poderes;
    private int stamina;
    private String nome;
    private int idade;
    private double altura;

    public Mario(){
        this.nome = "Mario Bros";
        this.idade = 40;
        this.altura = 1.50;
        this.stamina = 100;
    }

    public Mario(String nome, int idade, double altura) {
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

    public void superMario () {
        System.out.println("Nome: "+this.nome+", Idade: "+this.idade+", Altura: "+this.altura+", Stamina: "+this.stamina);

    }

    public void superPoderes (){
        System.out.println("Poder dar grandes saltos, mata inimigos com o peso do seu corpo, pode até voar");
    }
}

//fim da classe - Inicio main

  
public class Main {
    public static void main(String[] args) {

        Mario m1 = new Mario();
        m1.superMario();
        m1.superPoderes();

        System.out.println();

        Mario m2 = new Mario("Super Mario",40,1.50);
        m2.superMario();
        m2.superPoderes();
    }
}

