package model;

public class AttachService {
    private int idAttachService;
    private String nameAttachService;
    private double costAttachService;
    private int unitAttachService;
    private String statusAttachService;

    public AttachService() {
    }

    public AttachService(int idAttachService, String nameAttachService, double costAttachService, int unitAttachService, String statusAttachService) {
        this.idAttachService = idAttachService;
        this.nameAttachService = nameAttachService;
        this.costAttachService = costAttachService;
        this.unitAttachService = unitAttachService;
        this.statusAttachService = statusAttachService;
    }

    public int getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(int idAttachService) {
        this.idAttachService = idAttachService;
    }

    public String getNameAttachService() {
        return nameAttachService;
    }

    public void setNameAttachService(String nameAttachService) {
        this.nameAttachService = nameAttachService;
    }

    public double getCostAttachService() {
        return costAttachService;
    }

    public void setCostAttachService(double costAttachService) {
        this.costAttachService = costAttachService;
    }

    public int getUnitAttachService() {
        return unitAttachService;
    }

    public void setUnitAttachService(int unitAttachService) {
        this.unitAttachService = unitAttachService;
    }

    public String getStatusAttachService() {
        return statusAttachService;
    }

    public void setStatusAttachService(String statusAttachService) {
        this.statusAttachService = statusAttachService;
    }
}
