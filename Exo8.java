class Exo8{

private int grand;
private int[] listes;


public void grand(){

    this.listes = new int[]{11, 6, 18, 1, 42};

    this.grand = this.listes[0];

    for(int nb : this.listes){

        if(nb >= this.grand){
            this.grand = nb;
        }
    }
    System.out.println(this.grand);
}




}