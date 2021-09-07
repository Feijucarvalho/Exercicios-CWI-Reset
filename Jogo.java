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



