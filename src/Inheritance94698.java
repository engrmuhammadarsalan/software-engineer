class Animal{
    public void sound(){
        System.out.println("Animal Speaks");
    }

}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Bark's");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat Meow");
    }
}
public class Inheritance94698 {
    public static void main(String[] args) {

        Cat ca = new Cat();
        ca.sound();

        Dog d1 = new Dog();
        d1.sound();

        Animal an = new Animal();
        an.sound();
    }
}
