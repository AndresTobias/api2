package ar.com.yoprogramo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudios")

public class Estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institucion;
    private String titulo;
    @Column(name = "logo", length = 2048)
    private String logo;
    private String carrera;
    private Integer duracion;
    private Integer ingreso;
    private Integer egreso;

    // todos los get
    public Long getId() {
        return id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getlogo() {
        return logo;
    }

    public String getCarrera() {
        return carrera;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public Integer getEgreso() {
        return egreso;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
