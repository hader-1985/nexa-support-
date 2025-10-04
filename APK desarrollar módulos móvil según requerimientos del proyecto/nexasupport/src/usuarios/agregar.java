/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import conexion.conexion;
import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hader borré
 */
public class agregar {
    public static void main (String[] args){
    conexion con=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    String nombre = "daniel";
    String apellido = "felipe";
    String email = "h@gmail.com";
    String direccion = "142-17-35";
    String sql = "INSERT INTO usuarios (nombre, apellido, email, direccion) values ('"+nombre+"','"+apellido+"','"+email+"','"+direccion+"')";
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException ex){
        Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);    
    }
    try{
    cn=con.getConection();
    st=cn.createStatement();
    st.executeUpdate(sql);
    rs=st.executeQuery("SELECT * FROM usuarios ");
    rs.next();
    
    do{
    System.out.println(rs.getInt("id_usuario")+":"+rs.getString("nombre")+"-"+rs.getString("apellido")+"-"+rs.getString("email")+"-"+rs.getString("direccion"));
    
    }while (rs.next());
    
    
    }catch (SQLException ex){
        Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }   
}
