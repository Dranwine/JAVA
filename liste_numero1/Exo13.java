import java.util.Scanner;
package liste_numero1;


public class Exo13{

    private int TTC;
    private double HT;

    public void Taxe(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("donne moi un prix TTC: ");
        this.TTC = scanner.nextInt();
        scanner.close();
        this.HT = this.TTC-this.TTC*0.20;
        System.out.println("le prix HT est de "+this.HT);
    }
}