package ru.ivanmataras.education.chapter6;

class Exercise_5 {

    public String publicStringField;
    protected String protectedStringField;
    String packageStringField;
    private String privateStringField;

    public Exercise_5() {

    }

    private String getPrivateStringField() {
        return privateStringField;
    }

    private void setPrivateStringField(String privateStringField) {
        this.privateStringField = privateStringField;
    }

    String getPackageStringField() {
        return packageStringField;
    }

    void setPackageStringField(String packageStringField) {
        this.packageStringField = packageStringField;
    }

    protected String getProtectedStringField() {
        return protectedStringField;
    }

    protected void setProtectedStringField(String protectedStringField) {
        this.protectedStringField = protectedStringField;
    }

    public String getPublicStringField() {
        return publicStringField;
    }

    public void setPublicStringField(String publicStringField) {
        this.publicStringField = publicStringField;
    }

}