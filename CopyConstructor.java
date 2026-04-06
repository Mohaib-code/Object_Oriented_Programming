public class CopyConstructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="sofia";
        s1.roll=123;
        s1.marks[0]=10;
        s1.marks[1]=20;
        s1.marks[2]=30;
       

        Student s2=new Student(s1);
         s1.marks[2]=90;
        System.out.println(s2.name);
        for (int i = 0; i <3; i++) {
            System.out.println(s2.marks[i]);
        }
        s1.marks[0]=19;
        
    }
}
class Student{
    String name;
    int roll;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called ...");
    }
    //Shallow Copy Constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
       
    }

    //Deep Copy Constructor
    // Student (Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     for (int i = 0; i < marks.length; i++) {
    //         this.marks[i]=s1.marks[i];
    //     }
    // }
}
