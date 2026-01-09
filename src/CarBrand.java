class Car{
    String brand;
    String speed;

    public void run(){
        System.out.println("You Are Driving!");
    }

}

public class CarBrand {
    public static void main(String[] args){

        Car c = new Car();
        c.brand = "Audi";
        c.speed = "35";

        c.run();

    }



}
