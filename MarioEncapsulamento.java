public class MarioEncapsulamento {
        public static void main(String[] args) {

            Personagem mario = new Personagem("Mario",40,1.5);
            Personagem luigui = new Personagem("Luigui",35,1.75);

            Jogo SM = new Jogo(mario,luigui);
            SM.jogar();




        }
    }

