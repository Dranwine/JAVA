package mini_app;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Gestionnaire{

private HashMap<String, HashMap<String, String>> contact;
private Scanner scanner;
private String choix;

public Gestionnaire(){
    this.scanner = new Scanner(System.in);
    this.contact = new HashMap<>();
}

    public String affiche_menu(){

        
        System.out.println("**************************************");
        System.out.println("Menu du gestionnaire :");
        System.out.println("0. Quitter");
        System.out.println("1. créer un contact");
        System.out.println("2. supprimer un contact");
        System.out.println("3. modifier un contact");
        System.out.println("4. afficher les noms");
        System.out.println("5. rechercher un contact");
        System.out.println("**************************************");
        System.out.println("Votre choix : ");
        return this.scanner.nextLine();
    }

    public void creer(){

        System.out.println("donne ton nom wesh :");
        String nom = this.scanner.nextLine().toLowerCase();
        HashMap<String, String> contact_info = new HashMap<>();
        

        System.out.println("Eettt madmoiselle t’as pas un 06? : ");
        contact_info.put("numero", this.scanner.nextLine());

        System.out.println("Ton email man steplai : ");
        contact_info.put("email", this.scanner.nextLine());

        System.out.println("Et tu viens d'où ???? : ");
        contact_info.put("adresse", this.scanner.nextLine());

        this.contact.put(nom, contact_info);

        
    }


    public void affichage(){

        if(!this.contact.isEmpty()){
            System.out.println("\nvoici les contact");
            for (Map.Entry<String, HashMap<String, String>> entry : this.contact.entrySet()) {
                String nom = entry.getKey(); // Nom du contact
                HashMap<String, String> info = entry.getValue(); // Informations du contact

                // Affichage formaté des informations
                System.out.printf("%s: %s, %s, %s%n", 
                    nom, 
                    info.get("numero"), 
                    info.get("email"), 
                    info.get("adresse")
            );
        }
    }
    }

    public void recherche(){
        
        System.out.println("qui recherches tu ? : ");
        String nom = this.scanner.nextLine().toLowerCase();

        if (this.contact.containsKey(nom)){
            HashMap<String, String> info = this.contact.get(nom);
            System.out.printf("%s: %s, %s, %s%n", 
            nom, 
            info.get("numero"), 
            info.get("email"), 
            info.get("adresse"));
        }else{
            System.out.println("Le contact n'existe pas");
        }
    }

        public void decision(){
        this.choix = affiche_menu();
        while (!this.choix.equals("0")){
            switch (this.choix){
                case "1":
                    this.creer();
                    break;
                case "2":
                    System.out.println("OURA");
                    break;
                case "3":
                    System.out.println("OURA");
                    break;
                case "4":
                    affichage();
                    break;
                case "5":
                    this.recherche();
                    break;
            }
            this.choix = this.affiche_menu();
        }


}
}
