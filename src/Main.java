public class Main {
    public static void main(String[] args){

        IdPassword user_information = new IdPassword();
        LoginPage login = new LoginPage(user_information.getLoginInfo());
    }
}
