package liste_numero2;
import java.util.Scanner;
import java.util.HashMap;

public class Prime{

        private String vehicule;
        private int age;
        private int km;
        private int prime;
        private double totale;
        private HashMap<String, Integer> choix = new HashMap<>();

    public void prix(){

        Scanner scanner = new Scanner(System.in);

        this.choix.put("voiture", 500);
        this.choix.put("moto", 300);
        this.choix.put("camion", 1000);

        System.out.println("choisi un type de véhicule : voiture, moto ou camion : ");
        this.vehicule = scanner.nextLine();

        System.out.println("quel age as ton véhicule ? ");
        this.age = scanner.nextInt();

        System.out.println("quel est le kilométrage de ton véhicule ? ");
        this.km = scanner.nextInt();
        scanner.close();

        this.prime= this.choix.get(this.vehicule);
        this.totale = this.prime;

        while(!this.choix.containsKey(this.vehicule)){
            System.out.println("choisi un type de véhicule : voiture, moto ou camion : ");
            this.vehicule = scanner.nextLine();
        }

        if (this.age <= 5){
            this.totale = this.prime;
        }if (this.km <= 20000){
            this.totale = this.prime;
        }if (this.age > 5){
            this.totale = this.totale+(this.prime*0.1);
        }if (this.km > 20000 && this.km <= 30000){
            this.totale = this.totale+(this.prime*0.05);
        }if (this.km > 30000){
            this.totale = this.totale +(this.prime*0.15);
        }
        System.out.println(this.totale);
    }
}