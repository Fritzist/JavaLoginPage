import java.util.HashMap;
import java.util.Scanner;

public class IdPassword {

    HashMap<String, String> logininfo = new HashMap<String, String>();
    Scanner input = new Scanner(System.in);

    IdPassword() {

        System.out.println("Create your username: ");
        String username = input.nextLine();

        System.out.println("Create your password: ");
        String password = input.nextLine();

        logininfo.put(username, password);

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
