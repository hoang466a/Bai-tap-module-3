package model;

public class Role {
    private int idRole;
    private String nameRole;

    public Role() {
    }

    public Role(int roleInt, String nameRole) {
        this.idRole = roleInt;
        this.nameRole = nameRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
