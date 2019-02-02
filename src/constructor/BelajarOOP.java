package constructor;

public class BelajarOOP {
    public static void main(String[]args){
        NotStudent s1 = new NotStudent("siiberad@gmail.com", 999999);
        System.out.println(s1.getEmail());
        System.out.println(s1.password);

        Student s2 = new Student("budi", 4.0);
        System.out.println(s2.getName());
        System.out.println(s2.gpa);


//        s1.email = "siiberad@gmail.com";
//        s1.password = 123456;
//        s1.JK = ('1','2');
//
//        Student s2 = new Student();
//        s2.name = "dinda";
//        s2.gpa = 3.7;
//
//        System.out.println(s2.getName());
//        System.out.println(s2.gpa);
//        System.out.println(s1.getEmail());
//        s1.setPassword(999999);
//        System.out.println(s1.password);
    }
}