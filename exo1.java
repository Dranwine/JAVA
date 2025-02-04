import java.util.Scanner;


class Exo1 {
// Etape 1 :  2 nombre via l'utilisateur
private Integer nb1;
private Integer nb2;
private int resultat;
private Scanner scanner;

public void Calcul(){

    scanner = new Scanner(System.in);
    System.out.print("Saisir un nombre: ");
    nb1 = scanner.nextInt();
    System.out.print("Saisir un nombre: ");
    nb2 = scanner.nextInt();
    resultat = nb1 + nb2;
    System.out.println("Resulat : " + resultat);

}

}