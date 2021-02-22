package ru.ivanmataras.education.chapter7;

class Parent {

    private String parentPrivateField;
    String parentPackageField;
    protected String parentProtectedField;
    public String parentPublicField;

    Parent() {

    }

    private void testParentPrivateMethod() {
        parentPrivateField = "initialized";
    }

    void testParentPackageMethod() {
        parentPackageField = "initialized";
    }

    protected void testParentProtectedMethod() {
        parentProtectedField = "initialized";
    }

    public void testParentPublicMethod() {
        parentPublicField = "initialized";
    }

}