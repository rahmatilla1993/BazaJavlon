/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazajavlon;

/**
 *
 * @author Hp
 */
public class Person {
    
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String ismi, String familiyasi, String seriya) {
        this.id = id;
        this.ismi = ismi;
        this.familiyasi = familiyasi;
         this.seriya = seriya;
       
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", ismi=" + ismi + ", familiyasi=" + familiyasi + ", tug_yili=" + seriya + '}';
    }
    
    
    private String ismi;
    
    private String familiyasi;
    
    private String seriya;

    public Person(String ismi, String familiyasi, String seriya) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.seriya = seriya;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getFamiliyasi() {
        return familiyasi;
    }

    public void setFamiliyasi(String familiyasi) {
        this.familiyasi = familiyasi;
    }

    public String getSeriya() {
        return seriya;
    }

    public void setSeriya(String seriya) {
        this.seriya = seriya;
    }
    
    
    
}
