import Library_functions.Hashing;
import Library_functions.Utils;
import Objects.User;

public class Login_Signup {
    public static boolean login(String db_username, String db_pw){
        System.out.println(db_username+":"+db_pw);
        System.out.println("Please enter username: ");
        String username = Utils.userInput();
        System.out.println("Please enter password: ");
        String password = Hashing.Hash(Utils.userInput());

        return username.equals(db_username) && password.equals(Hashing.Hash(db_pw));
    }
    public static User signup(){
        System.out.println("Please enter first name: ");
        String firstname = Utils.userInput();
        System.out.println("Please enter last name: ");
        String lastname = Utils.userInput();
        System.out.println("Please enter email: ");
        String email = Utils.userInput();
        System.out.println("Please enter username: ");
        String username = Utils.userInput();
        System.out.println("Please enter password: ");
        String password = Hashing.Hash(Utils.userInput());

        User user = new User(0, firstname, lastname, email, username, password);
        return user;
    }
}

/*
Notes:
----------------------------------------+
+ validate data
    + make sure data isn't in database
    + check data is the correct format
 */