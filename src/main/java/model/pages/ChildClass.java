package model.pages;

public class ChildClass extends ParentClass{

    public ChildClass() {
        System.out.println("Print child class!!");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
    }
}
