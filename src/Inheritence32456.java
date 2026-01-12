class Shape1{

    public void draw(){
        System.out.println("What Kind of Shape you want:?");
    }

}

class Circle extends Shape1 {

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
public class Inheritence32456 {

    public static void main(String[] args) {

//        Shape1 s1 = new Shape1();
//        s1.draw();

        Circle c2 = new Circle();
        c2.draw();

    }
}
