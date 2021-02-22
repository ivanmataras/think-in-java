package ru.ivanmataras.education.chapter7;

class Child extends Parent {

    public String childPublicField;
    protected String childProtectedField;
    String childPackageField;
    private String childPrivateField;

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