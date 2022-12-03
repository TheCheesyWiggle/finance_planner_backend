package Library_functions;
import java.security.MessageDigest;
public class Hashing {
    public static String Hash(String password){
        //initailizes empty string
        String result = "";
        //try catch handles any errors which occur
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");//grabs the SHA256 hashing algorithm
            byte[] hash = md.digest(password.getBytes("UTF-8"));//converts string to bytes using UTF-8 encoding
            return new String(hash); //returns as string
        }catch(Exception ex) {
            ex.printStackTrace();//prints error
        }
        return password;
    }

    public static boolean CompareHashed(String databasePassword, String userEnteredPassword) {
        return Hash(userEnteredPassword).equals(databasePassword);
    }
}
