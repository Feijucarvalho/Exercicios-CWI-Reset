public class Caneta {

        public String cor;
        private double ponta;
        public String modelo;
        protected int carga;
        public boolean tampada;
        public void status() {
            System.out.println("modelo " + this.modelo);
            System.out.println("ponta " + this.ponta);
            System.out.println("Uma caneta "+ this.cor);
            System.out.println("carga " + this.carga);
            System.out.println("Está tampada " + this.tampada);
        }
        public void rabiscar () {
            if (this.tampada == true) {
                System.out.println("ERRO! Nao posso rabiscar");
            }else {
                System.out.println("Estou rabiscando");

            }

        }

        public void tampar (){
            this.tampada = true;
        }

        public void destampar (){
            this.tampada = false;
        }
    }