/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazajavlon;

/**
 *
 * @author Hp
 */
public class Malumot {
    private Integer id_malumot;
    private String bak_diplom;
    private String mag_diplom;
    private Integer id_ishchi;

    public Malumot(Integer id_malumot, String bak_diplom, String mag_diplom, Integer id_ishchi) {
        this.id_malumot = id_malumot;
        this.bak_diplom = bak_diplom;
        this.mag_diplom = mag_diplom;
        this.id_ishchi = id_ishchi;
    }

    public Malumot(String bak_diplom, String mag_diplom, Integer id_ishchi) {
        this.bak_diplom = bak_diplom;
        this.mag_diplom = mag_diplom;
        this.id_ishchi = id_ishchi;
    }

    public Integer getId_malumot() {
        return id_malumot;
    }

    public void setId_malumot(Integer id_malumot) {
        this.id_malumot = id_malumot;
    }

    public String getBak_diplom() {
        return bak_diplom;
    }

    public void setBak_diplom(String bak_diplom) {
        this.bak_diplom = bak_diplom;
    }

    public String getMag_diplom() {
        return mag_diplom;
    }

    public void setMag_diplom(String mag_diplom) {
        this.mag_diplom = mag_diplom;
    }

    public Integer getId_ishchi() {
        return id_ishchi;
    }

    public void setId_ishchi(Integer id_ishchi) {
        this.id_ishchi = id_ishchi;
    }
    
    
}
