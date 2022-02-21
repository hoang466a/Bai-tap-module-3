package model;

public class Customer {
    private int idCustomer;
    private int typeIdCustomer;
    private String nameSustomer;
    private String birthdayCustomer;
    private boolean genderCustomer;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(int idCustomer, int typeIdCustomer, String nameSustomer, String birthdayCustomer, boolean genderCustomer, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer) {
        this.idCustomer = idCustomer;
        this.typeIdCustomer = typeIdCustomer;
        this.nameSustomer = nameSustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
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

    public String getNameSustomer() {
        return nameSustomer;
    }

    public void setNameSustomer(String nameSustomer) {
        this.nameSustomer = nameSustomer;
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
}
