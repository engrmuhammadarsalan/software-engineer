class Samsung{
    String brand;
    int price;

    Samsung(String brand, int price){
        this.brand = brand;
        this.price = price;

    }

    public void showDetails(){
        System.out.println("You are watching: " +brand );
        System.out.println("Its Price is: " +price);
    }
}

class Iphone{
    String brand;
    int price;

    Iphone(String brand, int price){
        this.brand = brand;
        this.price = price;

    }

    public void showDetails(){
        System.out.println("You are watching: " +brand );
        System.out.println("Its Price is: " +price);
    }
}

public class Mobile {

    public static void main (String[] args){

        Samsung smsug = new Samsung("A15",40000);
        smsug.showDetails();

        Iphone Iph = new Iphone("19 Pro Max",146939);
        Iph.showDetails();


    }
}
