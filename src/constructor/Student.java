package constructor;

public class Student {
    String name;
    double gpa;

    Student (String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    String getName(){
        return name;
    }

//    void setGpa(double gpa){
//        this.gpa = gpa;
//    }
}
