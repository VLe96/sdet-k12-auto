package model.components;

public class ExternalLoginPage extends LoginPage {
    @Override
    public void inputUserName(String usernameStr) {
        System.out.println(usernameStr);
    }
}
