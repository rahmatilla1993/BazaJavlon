/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bazajavlon;

/**
 *
 * @author Hp
 */
public class Malaka {
    
    private Integer id;

    public Malaka(Integer id, String mutaxassisligi, String lavozimi, String malaka_yli) {
        this.id = id;
        this.mutaxassisligi = mutaxassisligi;
        this.lavozimi = lavozimi;
        this.malaka_yli = malaka_yli;
    }

    public Malaka(String mutaxassisligi, String lavozimi, String malaka_yli) {
        this.mutaxassisligi = mutaxassisligi;
        this.lavozimi = lavozimi;
        this.malaka_yli = malaka_yli;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMutaxassisligi() {
        return mutaxassisligi;
    }

    public void setMutaxassisligi(String mutaxassisligi) {
        this.mutaxassisligi = mutaxassisligi;
    }

    public String getLavozimi() {
        return lavozimi;
    }

    public void setLavozimi(String lavozimi) {
        this.lavozimi = lavozimi;
    }

    public String getMalaka_yli() {
        return malaka_yli;
    }

    public void setMalaka_yli(String malaka_yli) {
        this.malaka_yli = malaka_yli;
    }
    
    private String mutaxassisligi;
    
    private String lavozimi;
    
    private String malaka_yli;
    
    private Integer person_id;

    public Malaka(Integer id, String mutaxassisligi, String lavozimi, String malaka_yli, Integer person_id) {
        this.id = id;
        this.mutaxassisligi = mutaxassisligi;
        this.lavozimi = lavozimi;
        this.malaka_yli = malaka_yli;
        this.person_id = person_id;
    }

    public Malaka(String mutaxassisligi, String lavozimi, String malaka_yli, Integer person_id) {
        this.mutaxassisligi = mutaxassisligi;
        this.lavozimi = lavozimi;
        this.malaka_yli = malaka_yli;
        this.person_id = person_id;
    }
    
    

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
    
    
    
}
