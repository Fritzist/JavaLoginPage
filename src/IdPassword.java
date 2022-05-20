import java.util.HashMap;

public class IdPassword {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IdPassword() {

        logininfo.put("Test", "Test");

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
