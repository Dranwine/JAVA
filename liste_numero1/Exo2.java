import java.util.Scanner;
package liste_numero1;

public class Exo2 {

private int age;
private Scanner scanner;

    public Exo2() {
        scanner = new Scanner(System.in);
    }

    public void Age(){

        System.out.println("donne ton age: ");
        age = scanner.nextInt();
        if (age >= 18){
            System.out.println("tu es majeur");
        }else{
            System.out.println("tu es mineur");
        }
    }



}
