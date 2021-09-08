public class Mario extends Personagem{
    private int yoshi;

    public int getYoshi() {
        return yoshi;
    }

    public void setYoshi(int yoshi) {
        this.yoshi = yoshi;
    }

    public void montarNoYoshi(){
        yoshi =+1;
    }
    public void marioMontadoNoYoshi(){
        if (this.yoshi == 0){
            System.out.println("Mario nao está montado no yoshi");
        }else{
            System.out.println("Mario esta montado no Yoshi");
        }
    }

}
