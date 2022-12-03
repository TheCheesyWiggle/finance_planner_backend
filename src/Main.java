import Objects.User;
import Library_functions.Hashing;

public class Main {

    public static void main(String[] args) {
        int id = 0;
        String first_name = "Finn";
        String last_name = "van Montfort";
        String email = "FV256@exeter.ac.uk";
        String username =  "TheCheesyWiggle";
        String pw = Hashing.Hash("password");

        User Finn = new User(id, first_name, last_name, email, username, pw);

        if (Login_Signup.login(Finn.getUsername(), "password")){
            System.out.println(Finn.toString());
        }
        else{
            System.out.println("Error try again");
        }
    }
}