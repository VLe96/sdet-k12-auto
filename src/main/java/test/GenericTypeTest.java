package test;

import model.components.ComponentExploring;
import model.components.ExternalLoginPage;
import model.components.InternalLoginPage;

public class GenericTypeTest {
    public static void main(String[] args) {
        ComponentExploring componentExploring = new ComponentExploring();
        try {
            componentExploring.login(InternalLoginPage.class, "Internal user");
            componentExploring.login(ExternalLoginPage.class, "External user");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
