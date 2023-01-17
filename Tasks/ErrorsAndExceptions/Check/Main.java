import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean Check(String login, String password, String confirmPassword){
        try{
            if (login.length() >= 20){throw new WrongLoginException();}
            if (password.length() >= 20){throw new WrongPasswordException();}
            String etalon = "1234567890qwertyuiopasdfghjklzxcvbnm_";
            for (int i = 0; i < etalon.length(); i++){
                if (!login.contains(etalon.substring(i, i))){throw new WrongLoginException();}
                if (!password.contains(etalon.substring(i, i))){throw new WrongPasswordException();}
            }
            if (!password.equals(confirmPassword)){throw new WrongPasswordException();}
            return true;
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println("Был введен неверный логин или пароль");
            return false;
        }
    }
    public static void main(String[] args) {

    }
}


