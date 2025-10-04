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
 * @hader borré
 */
public class editar {
    
     public static void main (String[] args){
    conexion con=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    int id_editar=21;
    String new_nombre = "Tatiana";
    String new_apellido = "Segura";
    String new_edad = "55";
    String sql = "UPDATE persona set nombre='"+new_nombre+"',apellido='"+new_apellido+"',edad='"+new_edad+"'where id="+id_editar;
    try{
     Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException ex){
        Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);    
    }
    try{
    cn=con.getConection();
    st=cn.createStatement();
    st.executeUpdate(sql);
    rs=st.executeQuery("SELECT * FROM usuarios ");
    rs.next();
    
     do{
    System.out.println(rs.getInt("id")+"-"+rs.getString("nombre")+"-"+rs.getString("apellido")+"-"+rs.getString("email")+"-"+rs.getString("direccion"));
    
    }while (rs.next());
    
    
    }catch (SQLException ex){
        Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }   
}
  
