import java.util.Scanner;
package liste_numero1;

//n'oublie pas d'utilisé this.
public class Exo6{

    private String mot;
    private String mot2;

    public void palindrome(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("donne un mot: ");
        this.mot = scanner.nextLine();


        this.mot2 = new StringBuilder(this.mot).reverse().toString();
        System.out.println(this.mot);
        System.out.println(this.mot2);

        if(this.mot.equals(this.mot2)){
            System.out.println("c'est un palindrome");
        }else{
            System.out.println("ce n'est pas un palindrome");
        }
    }
}