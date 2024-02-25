package lab1.domain;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String password;

    public Usuario(int idUsuario, String usuario, String password){
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public Usuario(){

    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "Persona{" + "idPersona=" + idUsuario + ", Nombre=" + usuario + ", Password=" + password; 
    }
}
