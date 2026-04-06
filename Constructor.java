public class Constructor {
    public static void main (String args[]){
        Student s1=new Student("Sofia");
        System.out.println(s1.studentName);
    }
}
class Student{
    String studentName;
    Student(String studentName){
        this.studentName=studentName;
        System.out.println("Constructor callled ...");
    }
}
