package lab1.datos;

import java.sql.*;
import java.util.*;


import lab1.domain.Usuario;

public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "";
    private static final String SQL_REMOVE = "";

    public List<Usuario> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario user = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

        while (rs.next()) {
            int idUsuario = rs.getInt("id_usuario");
            String usuario = rs.getString("usuario");
            String password = rs.getString("password");
            user = new Usuario(idUsuario, usuario, password);

            usuarios.add(user);
        }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                Conexion.close(conn);
                Conexion.close(stmt);
                Conexion.close(rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                Conexion.close(stmt);
                Conexion.close(conn);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return registros;
    }
}
