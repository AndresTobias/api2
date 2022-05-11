package ar.com.yoprogramo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_img")

public class PersonImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "text5", length = 2048)
    private String text5;
    @Column(name = "text6", length = 2048)
    private String text6;
    @Column(name = "text7", length = 2048)
    private String text7;
    @Column(name = "text8", length = 2048)
    private String text8;

    // get y set
    public void setText5(String text5) {
        this.text5 = text5;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }

    public void setText7(String text7) {
        this.text7 = text7;
    }

    public void setText8(String text8) {
        this.text8 = text8;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }

    public String getText8() {
        return text8;
    }

    public Long getId() {
        return id;
    }

}
