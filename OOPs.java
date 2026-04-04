public class OOPs{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.tipSize(5);
        System.out.println(p1.tip);
        System.out.println(p1.color);
        p1.color="Red";
        System.out.println(p1.color);

    }
}

class Pen {
    String color;
    int tip;
    void tipSize(int newTip){
        tip=newTip;
    }
    void changeColor(String newColor){
        color=newColor;
    }
}