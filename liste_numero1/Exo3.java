import java.util.Scanner;
package liste_numero1;

public class Exo3{

    private int nb;
    private int res;
    private int test;

    public void pairimpair(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("donne un nombre: ");
        this.nb = scanner.nextInt();
        scanner.close();
        System.out.println("donne un nombre pour test: ");
        this.test = scanner.nextInt();
        System.out.println(this.test);
        this.res = this.nb%2;
        if(this.res ==0 ){
            System.out.println("pair");
        }else{
            System.out.println("impair");
        }
    }

}