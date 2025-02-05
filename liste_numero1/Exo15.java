package liste_numero1;
import java.util.Scanner;


public class Exo15{

    private int photo;
    private double prix;


    public void photocopie(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("donne moi un nombre de photocopie à faire");
        this.photo = scanner.nextInt();
        scanner.close();
        this.prix = 0;

        if (this.photo <= 10 && this.photo != 0){
            this.prix = this.photo*0.20;
        }else if(this.photo <= 30){
            this.prix = this.photo*0.15;
        }else{
            this.prix = this.photo*0.10;
        }
        System.out.println("le prix des photocopie est de "+this.prix);
    }
}