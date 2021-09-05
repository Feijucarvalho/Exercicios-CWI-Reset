public class MarioAula5Main {
    public static void main(String[] args) {

        MarioAula5 m1 = new MarioAula5();
        MarioAula5 m2 = new MarioAula5();

        m1.setStamina(20);

        m1.crescer();

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
