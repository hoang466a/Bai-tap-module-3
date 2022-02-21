package model;

public class UserRole {
    private int idRole;
    private String username;

    public UserRole() {
    }

    public UserRole(int idRole, String username) {
        this.idRole = idRole;
        this.username = username;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
