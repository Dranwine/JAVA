package liste_numero1;

public class Exo11{

    private int[] liste;
    private int somme;

    public void add(){
        this.liste = new int[]{15,32,54,14,78};
        this.somme = 0;
        for(int nb : this.liste){
            this.somme=this.somme+nb;
        }
        System.out.println(somme);
    }
}