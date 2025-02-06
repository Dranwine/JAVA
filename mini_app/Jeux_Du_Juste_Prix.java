package mini_app;
import java.util.Random;
import java.util.Scanner;

public class Jeux_Du_Juste_Prix{

private int prix;
private int juste_prix;
private Random random;
private Scanner scanner;

public Jeux_Du_Juste_Prix(){
    this.scanner = new Scanner(System.in);
    System.out.println("donné un prix: ");
    this.prix = scanner.nextInt();
    this.random = new Random();
    this.juste_prix = this.random.nextInt(10001);
}

public void jeux(){
    this.prix = 0;
    while(this.prix != this.juste_prix){
        if(this.prix > this.juste_prix){
            System.out.println(this.juste_prix);
            System.out.println("c'est moins !");
            System.out.println("Donne un autre prix: ");
            this.prix = this.scanner.nextInt();
        }else if(this.prix < this.juste_prix){
            System.out.println(this.juste_prix);
            System.out.println("c'est plus !");
            System.out.println("Donne un autre prix: ");
            this.prix = this.scanner.nextInt();
        }
        }
    if(this.prix != this.juste_prix){
    System.out.println("Bravo tu à trouver le juste prix qui est de "+ this.juste_prix);
    }
    }
}
