package model;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private String birthdayEmployee;
    private String idCardEmployee;
    private double salaryEmployee;
    private String phoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    private int idPositionEmployee;
    private int idDegreeEducation;
    private int idDivisionEmployee;
    private String userNameEmployee;

    public Employee() {
    }

    public Employee(int idEmployee, String nameEmployee, String birthdayEmployee, String idCardEmployee, double salaryEmployee, String phoneEmployee, String emailEmployee, String addressEmployee, int idPositionEmployee, int idDegreeEducation, int idDivisionEmployee, String userNameEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPositionEmployee = idPositionEmployee;
        this.idDegreeEducation = idDegreeEducation;
        this.idDivisionEmployee = idDivisionEmployee;
        this.userNameEmployee = userNameEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(String birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getIdPositionEmployee() {
        return idPositionEmployee;
    }

    public void setIdPositionEmployee(int idPositionEmployee) {
        this.idPositionEmployee = idPositionEmployee;
    }

    public int getIdDegreeEducation() {
        return idDegreeEducation;
    }

    public void setIdDegreeEducation(int idDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
    }

    public int getIdDivisionEmployee() {
        return idDivisionEmployee;
    }

    public void setIdDivisionEmployee(int idDivisionEmployee) {
        this.idDivisionEmployee = idDivisionEmployee;
    }

    public String getUserNameEmployee() {
        return userNameEmployee;
    }

    public void setUserNameEmployee(String userNameEmployee) {
        this.userNameEmployee = userNameEmployee;
    }
}
