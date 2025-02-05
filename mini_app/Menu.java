package mini_app;
import java.util.Scanner;


public class Menu{

    private String choix;
    private String rep;
    private Scanner scanner = new Scanner(System.in);

    public String affiche_menu(){

        
        System.out.println("**************************************");
        System.out.println("Menu de l'application :");
        System.out.println("0. Quitter");
        System.out.println("1. Calculer une remise en %");
        System.out.println("2. Lancé de dé");
        System.out.println("3. Jeu du juste prix");
        System.out.println("4. Horloge numérique (HH:MM:SS qui défile)");
        System.out.println("5. Jeu du pendu");
        System.out.println("6. Décodeur César");
        System.out.println("7. Gestionnaire de contact");
        System.out.println("**************************************");
        System.out.println("Votre choix : ");
        return scanner.nextLine();
    }

    public void decision(){
        this.choix = affiche_menu();
        while (!this.choix.equals("0")){
            switch (this.choix){
                case "1":
                    System.out.println("OURA");
                    break;
                case "2":
                    System.out.println("OURA");
                    break;
                case "3":
                    System.out.println("OURA");
                    break;
                case "4":
                    System.out.println("OURA");
                    break;
                case "5":
                    System.out.println("OURA");
                    break;
                case "6":
                    System.out.println("OURA");
                    break;
                case "7":
                    System.out.println("OURA");
                    break;
            }
        }

            System.out.print("Voulez-vous revenir au menu ? oui ou non : ");
            this.rep = scanner.nextLine();

            if (this.rep == "oui"){
                this.choix = affiche_menu();
            }else if (this.rep == "non"){
                this.choix = fin();
                System.out.println("*** FIN DU PROGRAMME ***");
            }


    }

    private String fin(){
    String i = "0";
    return i;
    }
}
