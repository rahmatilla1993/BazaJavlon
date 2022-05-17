/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author arxitektor
 */
public class DBService {
    
    private String url = "jdbc:postgresql://localhost:5432/AbdualimovJ";
    
    private String username = "postgres";
    
    private String password = "01082000";
    
    protected Connection connection;
    
    public DBService(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[]args){
        DBService dbService = new DBService();
    }
}
