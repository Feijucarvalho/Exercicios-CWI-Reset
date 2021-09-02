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
