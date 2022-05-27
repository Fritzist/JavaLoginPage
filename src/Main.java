import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        RegisterPage register = new RegisterPage(new HashMap<>());
        IdPassword user_information = new IdPassword();
        LoginPage login = new LoginPage(user_information.getLoginInfo());
    }
}
