package model;

public class Customer {
    private int idCustomer;
    private int typeIdCustomer;
    private String nameCustomer;
    private String birthdayCustomer;
    private boolean genderCustomer;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private String typeNameCustomer;



    public Customer() {
    }

    public Customer(int idCustomer, int typeIdCustomer, String nameCustomer, String birthdayCustomer, boolean genderCustomer, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer) {
        this.idCustomer = idCustomer;
        this.typeIdCustomer = typeIdCustomer;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
    }

    public Customer(int idCustomer, int typeIdCustomer, String nameCustomer, String birthdayCustomer, boolean genderCustomer, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, String typeNameCustomer) {
        this.idCustomer = idCustomer;
        this.typeIdCustomer = typeIdCustomer;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.typeNameCustomer = typeNameCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getTypeIdCustomer() {
        return typeIdCustomer;
    }

    public void setTypeIdCustomer(int typeIdCustomer) {
        this.typeIdCustomer = typeIdCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public boolean isGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(boolean genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getTypeNameCustomer() {
        return typeNameCustomer;
    }

    public void setTypeNameCustomer(String typeNameCustomer) {
        this.typeNameCustomer = typeNameCustomer;
    }
}
