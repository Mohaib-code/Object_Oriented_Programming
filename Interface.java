public class Interface {
    public static void main (String args[]){
        Queen q=new Queen();
        q.moves();
        King k=new King();
        k.moves();
    }
}
interface Herbivore{
    void grass();
}
interface Carnivore{
    void meat();
}
class Bear implements Herbivore,Carnivore{
   public void grass(){
        System.out.println("Eat Grass");
    }
    public void meat(){
        System.out.println("Eat meat");
    }
}
interface Chess{
    void moves();
    
}
class Queen implements Chess{
    public void moves(){
        System.out.println("left,right,up,down,diagonal in all direction");
    }
}
class Rook implements Chess{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}
class King implements Chess{
    public void moves(){
        System.out.println("left,right,up,down,diagonal in all direction(By 1 step)");
    }
}
