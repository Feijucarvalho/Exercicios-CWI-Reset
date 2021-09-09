public class MarioAula10 {
        public static void main(String[] args) {


        Mario m = new Mario(1.5);
        m.crescer();
        Luigui l = new Luigui(1.7);
        l.crescer();
        Yoshi y = new Yoshi(1.2);
        y.crescer();
        m.saltar(1.5);
        l.saltar(1.7);
        y.saltar(1.2);
        m.saltar("obstaculo");
        l.saltar("obstaculo");
        y.saltar("obstaculo");
        }
    }

