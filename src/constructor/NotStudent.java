package constructor;

public class NotStudent {
    String email;
    Integer password;
    //Enum JK;

    NotStudent (String email, Integer password){
        this.email = email;
        this.password = password;
    }

    String getEmail(){
        return email;
    }

//    void setPassword(Integer password){
//        this.password = password;
//    }
}
