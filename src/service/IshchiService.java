/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import bazajavlon.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class IshchiService extends DBService {
    
    public ResultSet getworkers(){
        String query = "SELECT * FROM ishchi";
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Person> getPersons(){
        List<Person> persons=new ArrayList<>();
        ResultSet rs = getworkers();
        try {
            while(rs.next()){
                Integer id = Integer.parseInt(rs.getString(1));
                String firstname = rs.getString(3);
                String lastname = rs.getString(2);
                String seriya = rs.getString(4);
                
                Person person = new Person(id,firstname,lastname,seriya);
                persons.add(person);
            }
            return persons;
        } catch (SQLException ex) {
            Logger.getLogger(IshchiService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
     public boolean addIshchi(Person person){
        
        String query = "INSERT INTO ishchi(familiyasi,ismi,passport_seriya)"
                    + "VALUES('" + person.getFamiliyasi() + "','" + person.getIsmi() +
                    "','" + person.getSeriya() + "');";
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
     
     public Person getPersonById(Integer id_person){
        String query = "SELECT * FROM ishchi WHERE id_ishchi = " + id_person;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            
            Integer id = Integer.parseInt(rs.getString(1));
            String firstname = rs.getString(3);
            String lastname = rs.getString(2);
            String seriya = rs.getString(4);
            return new Person(id, firstname, lastname, seriya);
        } catch (SQLException ex) {
            Logger.getLogger(IshchiService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public boolean editPerson(Person person){
        
        String query = "UPDATE shaxs_malumoti SET "
                + "familiyasi = '" + person.getFamiliyasi() + "',"
                + "ismi = '" + person.getIsmi() + "',"
                + "passport_seriya = '" + person.getSeriya() + "' "
                + "WHERE id_ishchi = " + person.getId();
        try {
            Statement createStatement = connection.createStatement();
            createStatement.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IshchiService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
    public Integer getPersonIdByInitial(String []values){
        try {
            String query = "SELECT * FROM ishchi WHERE familiyasi = '" + values[0] + "'";
            Statement createStatement = connection.createStatement();
            ResultSet rs = createStatement.executeQuery(query);
            rs.next();
            String _id = rs.getString("id_ishchi");
            Integer id = Integer.parseInt(_id);
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(IshchiService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
     
     public boolean deletePerson(Integer id_person){
        
        String query = "DELETE FROM ishchi WHERE id_ishchi = " + id_person;
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IshchiService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private void getWorkers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
