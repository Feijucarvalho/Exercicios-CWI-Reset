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

