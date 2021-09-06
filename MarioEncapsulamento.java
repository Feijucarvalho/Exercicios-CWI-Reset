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

