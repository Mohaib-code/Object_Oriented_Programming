public class Static {
    public static void main(String args[]){
        School s1=new School();
        
        System.out.println(s1.roll=10);
        System.out.println(s1.name="abc");
        School s2=new School();
        System.out.println(s2.roll);
        System.out.println(s2.name);
    }
}

class School{
    int roll;
    static String name;
    
}