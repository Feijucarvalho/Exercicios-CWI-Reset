public class MarioEncapsulamento {
        public static void main(String[] args) {

            MarioAula6 m1 = new MarioAula6();
            MarioAula6 m2 = new MarioAula6();

            m1.setStamina(20);

            m1.crescer();

            m1.perderStamina();
            m1.perderStamina();
            m1.perderStamina();
            m1.revigorar();
            m1.morrer();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();
            m1.colelaMoedas();


            m2.ganharStamina();
            m2.ganharStamina();
            m2.ganharStamina();
            m2.morrer();
            m2.morrer(); 

            m1.superMario();
            m1.superPoderes();

            m2.superMario();
            m2.superPoderes();

            System.out.println();


        }
    }

