/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "actividaddeporte")
@NamedQueries({
    @NamedQuery(name = "ActividadDeporte.findAll", query = "SELECT a FROM ActividadDeporte a"),
    @NamedQuery(name = "ActividadDeporte.findByIdActvidad", query = "SELECT a FROM ActividadDeporte a WHERE a.idActvidad = :idActvidad"),
    @NamedQuery(name = "ActividadDeporte.findByNombreActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.nombreActividad = :nombreActividad"),
    @NamedQuery(name = "ActividadDeporte.findByDuracionActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.duracionActividad = :duracionActividad"),
    @NamedQuery(name = "ActividadDeporte.findByLocalizacionActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.localizacionActividad = :localizacionActividad"),
    @NamedQuery(name = "ActividadDeporte.findByPrecioActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.precioActividad = :precioActividad"),
    @NamedQuery(name = "ActividadDeporte.findByFechainicioActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.fechainicioActividad = :fechainicioActividad"),
    @NamedQuery(name = "ActividadDeporte.findByDescripcionActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.descripcionActividad = :descripcionActividad"),
    @NamedQuery(name = "ActividadDeporte.findByHorarioActividad", query = "SELECT a FROM ActividadDeporte a WHERE a.horarioActividad = :horarioActividad")})
public class ActividadDeporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actvidad")
    private Integer idActvidad;
    @Size(max = 45)
    @Column(name = "nombre_actividad")
    private String nombreActividad;
    @Size(max = 45)
    @Column(name = "duracion_actividad")
    private String duracionActividad;
    @Size(max = 45)
    @Column(name = "localizacion_actividad")
    private String localizacionActividad;
    @Size(max = 45)
    @Column(name = "precio_actividad")
    private String precioActividad;
    @Size(max = 45)
    @Column(name = "fechainicio_actividad")
    private String fechainicioActividad;
    @Size(max = 45)
    @Column(name = "descripcion_actividad")
    private String descripcionActividad;
    @Size(max = 45)
    @Column(name = "horario_actividad")
    private String horarioActividad;
    @JoinColumn(name = "identrenador", referencedColumnName = "id_entrenador")
    @ManyToOne
    private Entrenador entrenador;
    @ManyToMany
    @JoinTable(
            name = "curso_has_usuario",
            joinColumns = @JoinColumn(name = "id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_actividad"))
    List<Usuario> listaUsuarios;

    public ActividadDeporte() {
    }

    public ActividadDeporte(Integer idActvidad) {
        this.idActvidad = idActvidad;
    }

    public Integer getIdActvidad() {
        return idActvidad;
    }

    public void setIdActvidad(Integer idActvidad) {
        this.idActvidad = idActvidad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDuracionActividad() {
        return duracionActividad;
    }

    public void setDuracionActividad(String duracionActividad) {
        this.duracionActividad = duracionActividad;
    }

    public String getLocalizacionActividad() {
        return localizacionActividad;
    }

    public void setLocalizacionActividad(String localizacionActividad) {
        this.localizacionActividad = localizacionActividad;
    }

    public String getPrecioActividad() {
        return precioActividad;
    }

    public void setPrecioActividad(String precioActividad) {
        this.precioActividad = precioActividad;
    }

    public String getFechainicioActividad() {
        return fechainicioActividad;
    }

    public void setFechainicioActividad(String fechainicioActividad) {
        this.fechainicioActividad = fechainicioActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getHorarioActividad() {
        return horarioActividad;
    }

    public void setHorarioActividad(String horarioActividad) {
        this.horarioActividad = horarioActividad;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idActvidad);
        hash = 79 * hash + Objects.hashCode(this.nombreActividad);
        hash = 79 * hash + Objects.hashCode(this.duracionActividad);
        hash = 79 * hash + Objects.hashCode(this.localizacionActividad);
        hash = 79 * hash + Objects.hashCode(this.precioActividad);
        hash = 79 * hash + Objects.hashCode(this.fechainicioActividad);
        hash = 79 * hash + Objects.hashCode(this.descripcionActividad);
        hash = 79 * hash + Objects.hashCode(this.horarioActividad);
        hash = 79 * hash + Objects.hashCode(this.entrenador);
        hash = 79 * hash + Objects.hashCode(this.listaUsuarios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActividadDeporte other = (ActividadDeporte) obj;
        if (!Objects.equals(this.nombreActividad, other.nombreActividad)) {
            return false;
        }
        if (!Objects.equals(this.duracionActividad, other.duracionActividad)) {
            return false;
        }
        if (!Objects.equals(this.localizacionActividad, other.localizacionActividad)) {
            return false;
        }
        if (!Objects.equals(this.precioActividad, other.precioActividad)) {
            return false;
        }
        if (!Objects.equals(this.fechainicioActividad, other.fechainicioActividad)) {
            return false;
        }
        if (!Objects.equals(this.descripcionActividad, other.descripcionActividad)) {
            return false;
        }
        if (!Objects.equals(this.horarioActividad, other.horarioActividad)) {
            return false;
        }
        if (!Objects.equals(this.idActvidad, other.idActvidad)) {
            return false;
        }
        if (!Objects.equals(this.entrenador, other.entrenador)) {
            return false;
        }
        if (!Objects.equals(this.listaUsuarios, other.listaUsuarios)) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        return "Curso de "+descripcionActividad+" por un precio de "+precioActividad+"€, dado por "+entrenador.getNombreEntrenador()+
                ". Empieza el "+fechainicioActividad+" con una duración de"+duracionActividad+" minutos los "+horarioActividad+"";
    }
    
}
