public class Mario {

    String nacionalidade;
    String corOlhos;
    String tamanho;
    String corCabelo;
    String poderes;

    void caracetristicasFisicas () {
    System.out.println("Mario tem os cabelos "+this.corCabelo+" ele é "+this.nacionalidade+" de estatura "+this.tamanho+" e tem os olhos "+this.corOlhos+".");

    }

    void superPoderes (){
    System.out.println(poderes);
    }
}

//fim class
//inicio main

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.nacionalidade = "Italiano";
        mario.corCabelo = "Castanho";
        mario.corOlhos ="Azuis";
        mario.tamanho ="Baixa";
        mario.poderes = "Ele pode voar, pula alto, derruba objeto com o peso do seu corpo, etc...";
        mario.caracetristicasFisicas();
        mario.superPoderes();


    }
}
