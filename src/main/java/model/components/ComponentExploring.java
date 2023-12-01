package model.components;

import java.lang.reflect.Constructor;

public class ComponentExploring {

    // Boundary Generic Type
    public <T extends  LoginPage> void login(Class<T> loginPageClass, String username) throws NoSuchMethodException {
        // Wildcard Generic type
        Class<?>[] parameters = new Class[]{};
        try{
            //JAVA reflection
            Constructor<T> contructor = loginPageClass.getConstructor(parameters);
            T loginPageObj = contructor.newInstance();
            loginPageObj.inputUserName(username);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
