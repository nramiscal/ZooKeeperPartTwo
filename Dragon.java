public class Dragon extends Mammal {

    // constructor
    public Dragon(){
        setEnergy(300);
    }

    public void fly(){
        System.out.println("Flap, flap, flap!!!");
        setEnergy(getEnergy()-50);
    }

    public void eatHumans(){
        System.out.println("Yummy yummy humans!");
        setEnergy(getEnergy()+25);
    }

    public void attackTown(){
        System.out.println("Whoooosh! A town is ablaze!!!");
        setEnergy(getEnergy()+100);
    }

}
