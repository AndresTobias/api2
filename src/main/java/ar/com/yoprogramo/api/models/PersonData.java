package ar.com.yoprogramo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_data")

public class PersonData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    
    
    public String getText1() {
        return text1;
    }
    public String getText4() {
        return text4;
    }
    public void setText4(String text4) {
        this.text4 = text4;
    }
    public String getText3() {
        return text3;
    }
    public void setText3(String text3) {
        this.text3 = text3;
    }
    public String getText2() {
        return text2;
    }
    public void setText2(String text2) {
        this.text2 = text2;
    }
    public void setText1(String text1) {
        this.text1 = text1;
    }
}
