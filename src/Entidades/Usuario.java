package Entidades;

public class Usuario {
    private int iduser;
    private String user;
    private String contraseña;

    public Usuario(int iduser, String user, String contraseña) {
        this.iduser = iduser;
        this.user = user;
        this.contraseña = contraseña;
    }
    public int getIduser() {
        return iduser;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
