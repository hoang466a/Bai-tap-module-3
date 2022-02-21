package model;

public class ContractDetail {
    private int idContractDetail;
    private int idContract;
    private int idAttachService;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int idContractDetail, int idContract, int idAttachService, int quantity) {
        this.idContractDetail = idContractDetail;
        this.idContract = idContract;
        this.idAttachService = idAttachService;
        this.quantity = quantity;
    }

    public int getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(int idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(int idAttachService) {
        this.idAttachService = idAttachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
