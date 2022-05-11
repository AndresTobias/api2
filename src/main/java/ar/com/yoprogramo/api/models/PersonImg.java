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
    @Column(name = "url_imagen1", length = 2048)
    private String urlimage1;
    @Column(name = "url_imagen2", length = 2048)
    private String urlimage2;
    @Column(name = "url_imagen3", length = 2048)
    private String urlimage3;
    @Column(name = "url_imagen4", length = 2048)
    private String urlimage4;

    // get y set
    public void setUrlimage1(String urlimage1) {
        this.urlimage1 = urlimage1;
    }

    public void setUrlimage2(String urlimage2) {
        this.urlimage2 = urlimage2;
    }

    public void setUrlimage3(String urlimage3) {
        this.urlimage3 = urlimage3;
    }

    public void setUrlimage4(String urlimage4) {
        this.urlimage4 = urlimage4;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlimage1() {
        return urlimage1;
    }

    public String getUrlimage2() {
        return urlimage2;
    }

    public String getUrlimage3() {
        return urlimage3;
    }

    public String getUrlimage4() {
        return urlimage4;
    }

    public Long getId() {
        return id;
    }

}
