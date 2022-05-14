package ar.com.yoprogramo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajos")

public class Trabajos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;
    private String puesto;
    @Column(name = "logo", length = 2048)
    private String logo;
    private String lugar;
    private Integer duracion;
    private Integer ingreso;
    private Integer egreso;

    // todos los get
    public Long getId() {
        return id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getlogo() {
        return logo;
    }

    public String getLugar() {
        return lugar;
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
    // todos lod set

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setlogo(String logo) {
        this.logo = logo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public void setEgreso(Integer egreso) {
        this.egreso = egreso;
    }

}
