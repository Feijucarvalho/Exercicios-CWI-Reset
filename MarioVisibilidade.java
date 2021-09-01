public class MarioVisibilidade {


        public String nacionalidade;
        //private String corOlhos;Erro pois pode acessar pois esta privado
        protected String tamanho;
        public String corCabelo;
        protected String poderes;

        public void caracetristicasFisicas () {
            System.out.println("Mario tem os cabelos "+this.corCabelo+" ele é "+this.nacionalidade+" de estatura "+this.tamanho+/*" e tem os olhos "+this.corOlhos+*/".");

        }

        public void superPoderes (){
            System.out.println(poderes);
        }
    }
//Fim 
//inicio main

  
public class MarioVisibilidadeMain {

    public static void main(String[] args) {

                MarioVisibilidade mario = new MarioVisibilidade();
                mario.nacionalidade = "Italiano";
                mario.corCabelo = "Castanho";
                //mario.corOlhos = "Azuis";
                mario.tamanho = "Baixa";
                mario.poderes = "Ele pode voar, pula alto, derruba objeto com o peso do seu corpo, etc...";
                mario.caracetristicasFisicas();
                mario.superPoderes();


            }
        }


