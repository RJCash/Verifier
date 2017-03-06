/**
 * Created by rickiecashwell on 3/3/17.
 */
import javax.swing.JOptionPane;
public class PasswordDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String password = JOptionPane.showInputDialog("Give a password. The Password must be at least 6 "
                + "Characters in length with at least one capital and one lowercase letter and the password must have" +
                "at least one digit");
        theVerifier verify = new theVerifier(password);

        if(verify.isValid()){
            JOptionPane.showMessageDialog(null, "The password is valid");
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "The password is invalid");
            System.exit(0);
        }

    }

}
