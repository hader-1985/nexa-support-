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
 * @author milto
 */
public class eliminar {
    
     public static void main (String[] args){
    conexion con=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    //dato a eliminar 
     int id_eliminar=12;
     
     // instruccion sql
     
     String sql= "DELETE fROM usuarios where id="+id_eliminar;
     
     try{
     Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException ex){
        Logger.getLogger(eliminar.class.getName()).log(Level.SEVERE, null, ex);    
    }
    try{
    cn=con.getConection();
    st=cn.createStatement();
    st.executeUpdate(sql);
    rs=st.executeQuery("SELECT * FROM usuarios ");
    rs.next();
    
    do{
    System.out.println(rs.getInt("id_usuario")+"-"+rs.getString("nombre")+"-"+rs.getString("apellido")+"-"+rs.getString("email")+"-"+rs.getString("direccion"));
    
    }while (rs.next());
    
    
    }catch (SQLException ex){
        Logger.getLogger(eliminar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }   
}
   
