package mini_app;
import java.util.Random;
import java.util.Scanner;

public class Lancer_De_De{

private int fois;
private int de;
private int destin;
private int resultat;
private Random random;

public Lancer_De_De(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("choisis le nombre de face du dé: ");
    this.de = scanner.nextInt();
    System.out.println("choisis le nombre de lancer du dé: ");
    this.fois = scanner.nextInt();
    scanner.close();
    this.random = new Random();
}

public void destin(){

    int i = 1;
    while (i <= this.fois){
        this.resultat = this.random.nextInt(this.de);
        System.out.println("le dé donne :" + this.resultat);
        i = i + 1;
    }
}
}