package mini_app;
import java.util.Scanner;

public class Calcul_Remise{

    private int montant;
    private int remise;
    private double resultat;

    public Calcul_Remise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("quel est le montant: ");
        this.montant = scanner.nextInt();
        System.out.println("quel est le pourcentage de la remise: ");
        this.remise = scanner.nextInt();
    }



    public void Calcul(){
        this.resultat = this.montant - (this.montant*(this.remise/100));
    }

    @Override
    public String toString(){
        return "la réduction est de "+this.resultat+" euros.";
    }

}