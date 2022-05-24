package ar.com.yoprogramo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tortas")

public class Tortas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @Column(name = "logo", length = 2048)
    private String logo;
    private Integer progreso;

    // todos los get
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getlogo() {
        return logo;
    }

    public Integer getProgreso() {
        return progreso;
    }

    // todos los set
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }

    public void setProgreso(Integer progreso) {
        this.progreso = progreso;
    }

}
