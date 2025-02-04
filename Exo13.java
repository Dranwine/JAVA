import java.util.Scanner;


class Exo12{

    private int TTC;
    private int HT;

    public int Taxe(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("donne moi un prix TTC: ");
        this.TTC = scanner.nextInt();
        scanner.close();
        this.HT = this.TTC*0.20;
        System.out.println("le prix HT est de "+this.HT);
    }
}