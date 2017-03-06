/**
 * Created by rickiecashwell on 3/3/17.
 */
public class theVerifier {
    String password;
    boolean goodsofar = true;

    public theVerifier(String Password){

        password = Password;
    }

    public boolean isValid(){
        int i = 0;
        int digitcount = 0, lettercount = 0, Capletter =0, Lowletter = 0;
        if(password.length() < 6){
            goodsofar= false;
        }
        while (goodsofar && i < password.length()){
            if(Character.isDigit(password.charAt(i))){
                digitcount++;
                i++;
            }else{
                if(Character.isLetter(password.charAt(i))){
                    if(Character.isLowerCase(password.charAt(i))){
                        lettercount++;
                        Lowletter++;
                        i++;
                    }
                    else if(Character.isUpperCase(password.charAt(i))){
                        lettercount++;
                        Capletter++;
                        i++;
                    }
                }
                else{
                    i++;
                }
            }
        }
        if(digitcount >= 1 && lettercount >=2 && Capletter >= 1 && Lowletter >= 1){
            goodsofar = true;
        }else{
            goodsofar = false;
        }
        return goodsofar;
    }
}
