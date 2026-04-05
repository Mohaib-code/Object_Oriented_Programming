public class OOPs{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.tipSize(5);
        System.out.println(p1.setTip());
        System.out.println(p1.setColor());
        p1.changeColor("Red");
        System.out.println(p1.setColor());

    }
}

class Pen {
    private String color;
    private int tip;
    //Setter
    String setColor(){
        return this.color;
    }
    int setTip(){
        return this.tip;
    }
    //Getter
    void changeColor(String newColor){
        color=newColor;
    }
    void tipSize(int newTip){
        tip=newTip;
    }
    
}