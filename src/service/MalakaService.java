/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import bazajavlon.Malaka;
import bazajavlon.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class MalakaService extends DBService {
    
    public ResultSet getMalaka(){
        String query = "SELECT * FROM malakasi";
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            return null;
        }
    }
     public boolean addMalaka(Malaka malaka){
        
        String query = "INSERT INTO malakasi(mutaxassisligi,lavozimi,malaka_yili,id_ishchi)"
                    + "VALUES('" + malaka.getMutaxassisligi() + "','" + malaka.getLavozimi() +
                    "','" + malaka.getMalaka_yli() + "'," + malaka.getPerson_id() + ");";
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException ex) {
             Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     public Malaka getMalakaById(Integer id){
        String query = "SELECT * FROM malakasi WHERE id_malaka = " + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            
            Integer _id = Integer.parseInt(rs.getString(1));
            String mutaxassisligi = rs.getString(3);
            String lavozimi = rs.getString(2);
            String malaka_yli = rs.getString(4);
            return new Malaka(_id, mutaxassisligi, lavozimi, malaka_yli);
        } catch (SQLException ex) {
            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public boolean editMalaka(Malaka malaka){
        
        String query = "UPDATE malakasi SET "
                + "mutaxassisligi = '" + malaka.getMutaxassisligi() + "',"
                + "lavozimi = '" + malaka.getLavozimi() + "',"
                + "malaka_yili = '" + malaka.getMalaka_yli() + "',"
                + "id_ishchi = " + malaka.getPerson_id()
                + " WHERE id_malaka = " + malaka.getId();
        try {
            Statement createStatement = connection.createStatement();
            createStatement.execute(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     public boolean deleteMalaka(Integer id){
        
        String query = "DELETE FROM malakasi WHERE id_malaka = " + id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
