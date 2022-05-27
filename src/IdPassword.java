import java.util.HashMap;
import java.util.Scanner;

public class IdPassword {

    HashMap<String, String> logininfo = new HashMap<String, String>();
    Scanner input = new Scanner(System.in);

    IdPassword() {

        String username = input.nextLine();

        String password = input.nextLine();

        logininfo.put(username, password);

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
