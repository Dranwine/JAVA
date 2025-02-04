import java.util.Scanner;

class Exo5{

    private String mot;
    private int i;
    private Scanner scanner;
    private String voyelle;


        public Exo5() {
        scanner = new Scanner(System.in);
    }

    public void voyelle(){

        System.out.println("donne un mot: ");
        mot = scanner.nextLine().toLowerCase();
        i = 0;

        for (char caractere : mot.toCharArray()){
            if (caractere == 'a'|| caractere == 'e'|| caractere == 'i'|| caractere == 'o'|| caractere == 'u'|| caractere == 'y' || caractere == 'é' || caractere == 'è' || caractere == 'ï' || caractere == 'î'){
            i = i + 1;
            }
        }
    System.out.println("il y a " + i + " voyelle(s).");
    }
}