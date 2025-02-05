import java.util.Scanner;
package liste_numero1;

public class Exo7{

    private int[] listes;
    private int petit;

    public void petit(){
        //étape 1 donner une liste 

        this.listes = new int []{11, 6, 18, 1, 42};
        //etape 2 savoir quel est le nombre le plus petit et l'indiquez

        this.petit = this.listes[0];

        for (int nb : this.listes){
            if (nb == 0){
                this.petit = nb;
            }else if(nb <= this.petit){
                this.petit = nb;
            }
        }   
        System.out.println(this.petit);
    }
}