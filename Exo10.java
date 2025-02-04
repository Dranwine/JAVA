import java.util.ArrayList;

class Exo10{

    private int[] liste;
    private ArrayList<Integer> nliste;
    private int rep;
    private int repmax;
    private int elu;

    public void nbplusrep(){

        this.liste = new int[]{45, 12, 60, 8, 61, 60, 60, 8, 12, 8, 60, 12, 60, 12, 8, 8, 8, 8, 12};
        this.nliste = new ArrayList<>();
        this.rep = 0;
        this.repmax = 0;

        for (int nb : this.liste){
            if(!this.nliste.contains(nb)){
                this.nliste.add(nb);
            }
        }

        for(int nb : this.nliste){
            for(int nb2 : this.liste){
                if(nb == nb2){
                    this.rep = rep + 1;
                }
            }
            if (this.rep > this.repmax){
                this.repmax = this. rep;
                this.elu = nb;
            }
            this.rep = 0;
        }
        System.out.println(this.elu);
    }


}