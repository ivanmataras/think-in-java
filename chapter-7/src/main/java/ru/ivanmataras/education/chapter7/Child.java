package ru.ivanmataras.education.chapter7;

public class Child extends Parent {

    private String childPrivateField;
    String childPackageField;
    protected String childProtectedField;
    public String childPublicField;

    Child() {

    }

    private void testChildPrivateMethod() {
        childPackageField = "initialized";
    }

    void testChildPackageMethod() {
        childPackageField = "initialized";
    }

    protected void testChildProtectedMethod() {
        childProtectedField = "initialized";
    }

    public void testChildPublicMethod() {
        childPublicField = "initialized";

    }

}