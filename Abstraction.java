public class Abstraction {
    public static void main (String args[]){
        Horse h1=new Horse();
        h1.eat();
        h1.leg();
        Chicken c1=new Chicken();
        c1.eat();
        c1.leg();
        Mustang m1=new Mustang();
        m1.eat();
        m1.leg();
        m1.run();
       
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
    void eat(){
        System.out.println("Eat to survive");
    }
    abstract void leg();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor");
    }
    void leg(){
        System.out.println("4");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor");
    }
    void run(){
        System.out.println("very fast..");
    }
}
class Chicken extends Animal{
    Chicken (){
        System.out.println("Chicken Constructor ");
    }
    void leg(){
        System.out.println("2");
    }
}