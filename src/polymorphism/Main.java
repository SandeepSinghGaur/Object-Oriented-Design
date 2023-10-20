package src.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new TA();
        User u1 = new Student();
        User u2 = new Mentor();
        User u3 = new User();
        List<User> users = List.of(u1,u2,new Student(),new Mentor(),u3);
        changePasswordForAllUser(users);
    }

    private static void changePasswordForAllUser(List<User> users) {
        for(User user : users){
            user.updatePassword();
        }
    }
}
