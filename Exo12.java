import java.util.Scanner;

class Exo12{

    private int table;
    private int rep;
    private int[] multiple;
    
    public void multiplication(){
        this.multiple= new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("donne une table de multiplication: ");
        this.table = scanner.nextInt();


        for(int nb : this.multiple){
            this.rep = nb*this.table;
            System.out.println(nb+"X"+this.table+"="+this.rep);
            rep=0;
        }


    }


}