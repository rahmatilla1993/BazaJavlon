/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bazajavlon.Malumot;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class MalumotService extends DBService{
    
    public ResultSet getMalumot(){
        String query = "SELECT * FROM malumoti";
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            return null;
        }
    }
     public boolean addMalumot(Malumot malumot){
        
        String query = "INSERT INTO malumoti (bakalavr_dip, magistr_dip, id_ishchi)"
                    + "VALUES('" + malumot.getBak_diplom() + "','" + malumot.getMag_diplom() +
                    "'," + malumot.getId_ishchi() + ");";
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException ex) {
             Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
     public Malumot getMalumotById(Integer id){
        String query = "SELECT * FROM malumoti WHERE id_malumot = " + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            
//            Integer _id = Integer.parseInt(rs.getString(1));
//            String mutaxassisligi = rs.getString(3);
//            String lavozimi = rs.getString(2);
//            String malaka_yli = rs.getString(4);
            return new Malumot(_id, rs.getString(1), rs.getString(2), Integer.parseInt(rs.getString(3)));
        } catch (SQLException ex) {
            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public boolean editMalumot(Malumot malumot){
        
//        String query = "UPDATE malakasi SET "
//                + "mutaxassisligi = '" + malaka.getMutaxassisligi() + "',"
//                + "lavozimi = '" + malaka.getLavozimi() + "',"
//                + "malaka_yili = '" + malaka.getMalaka_yli() + "',"
//                + "id_ishchi = " + malaka.getPerson_id()
//                + " WHERE id_malaka = " + malaka.getId();
//        try {
//            Statement createStatement = connection.createStatement();
//            createStatement.execute(query);
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
    }
     
     public boolean deleteMalumot(Integer id){
        
//        String query = "DELETE FROM malakasi WHERE id_malaka = " + id;
//        try {
//            Statement statement = connection.createStatement();
//            statement.execute(query);
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(MalakaService.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
    }
    
}
