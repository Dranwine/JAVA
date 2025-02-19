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
        return this.scanner.nextLine();
    }

    public void decision(){
        this.choix = affiche_menu();
        while (!this.choix.equals("0")){
            switch (this.choix){
                case "1":
                    Calcul_Remise calcul_remise = new Calcul_Remise();
                    calcul_remise.Calcul();
                    System.out.println(calcul_remise.toString());
                    break;
                case "2":
                    Lancer_De_De lancer_de_de = new Lancer_De_De();
                    lancer_de_de.destin();
                    break;
                case "3":
                    Jeux_Du_Juste_Prix jeux_du_juste_prix = new Jeux_Du_Juste_Prix();
                    jeux_du_juste_prix.jeux();
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
                    Gestionnaire gestionnaire = new Gestionnaire();
                    gestionnaire.decision();
                    break;
            }
            System.out.print("Voulez-vous revenir au menu ? oui ou non : ");
            this.rep = this.scanner.nextLine();

            if (this.rep.equals("oui")){
                this.choix = affiche_menu();
            }else if (this.rep.equals("non")){
                this.choix = fin();
                System.out.println("*** FIN DU PROGRAMME ***");
                scanner.close();
            }


        }



    }

    private String fin(){
    String i = "0";
    return i;
    }
}
