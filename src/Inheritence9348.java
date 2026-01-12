class Vehical{
    int speed;

    public void move(){
        System.out.println("Car Is Moving!");
    }
}
class Carr extends Vehical{

    public void playMusic(){
        System.out.println("Music IS Playing");
    }
}

public class Inheritence9348 {

    public static void main (String[] args){
//        Vehical v1 = new Vehical();
//        v1.move();

        Carr c1 = new Carr();
        c1.move();

    }
}
