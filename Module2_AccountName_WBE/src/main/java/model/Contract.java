package model;

public class Contract {
    private int idContract;
    private String startDateContract;
    private String endDateContract;
    private double depositContract;
    private double totalMoneyContract;
    private int idEmployee;
    private int idCustomer;
    private int idService;

    public Contract() {
    }

    public Contract(int idContract, String startDateContract, String endDateContract, double depositContract, double totalMoneyContract, int idEmployee, int idCustomer, int idService) {
        this.idContract = idContract;
        this.startDateContract = startDateContract;
        this.endDateContract = endDateContract;
        this.depositContract = depositContract;
        this.totalMoneyContract = totalMoneyContract;
        this.idEmployee = idEmployee;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getStartDateContract() {
        return startDateContract;
    }

    public void setStartDateContract(String startDateContract) {
        this.startDateContract = startDateContract;
    }

    public String getEndDateContract() {
        return endDateContract;
    }

    public void setEndDateContract(String endDateContract) {
        this.endDateContract = endDateContract;
    }

    public double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(double depositContract) {
        this.depositContract = depositContract;
    }

    public double getTotalMoneyContract() {
        return totalMoneyContract;
    }

    public void setTotalMoneyContract(double totalMoneyContract) {
        this.totalMoneyContract = totalMoneyContract;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }
}
