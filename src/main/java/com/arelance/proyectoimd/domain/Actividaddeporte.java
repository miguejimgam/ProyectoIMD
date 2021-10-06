/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
    @NamedQuery(name = "Actividaddeporte.findAll", query = "SELECT a FROM Actividaddeporte a"),
    @NamedQuery(name = "Actividaddeporte.findByIdActvidad", query = "SELECT a FROM Actividaddeporte a WHERE a.idActvidad = :idActvidad"),
    @NamedQuery(name = "Actividaddeporte.findByDuracionActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.duracionActividad = :duracionActividad"),
    @NamedQuery(name = "Actividaddeporte.findByLocalizacionActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.localizacionActividad = :localizacionActividad"),
    @NamedQuery(name = "Actividaddeporte.findByPrecioActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.precioActividad = :precioActividad"),
    @NamedQuery(name = "Actividaddeporte.findByFechainicioActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.fechainicioActividad = :fechainicioActividad"),
    @NamedQuery(name = "Actividaddeporte.findByDescripcionActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.descripcionActividad = :descripcionActividad"),
    @NamedQuery(name = "Actividaddeporte.findByHorarioActividad", query = "SELECT a FROM Actividaddeporte a WHERE a.horarioActividad = :horarioActividad")})
public class Actividaddeporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actvidad")
    private Integer idActvidad;
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
    @JoinColumns({
        @JoinColumn(name = "identrenador", referencedColumnName = "id_entrenador")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Entrenador entrenador;
    @ManyToMany(targetEntity = Usuario.class, cascade = CascadeType.PERSIST)
    private List<Usuario> listaUsuarios;

    public Actividaddeporte() {
        this.listaUsuarios = new ArrayList<>();
    }

    public Actividaddeporte(Integer idActvidad) {
        this.idActvidad = idActvidad;
    }
    
// <editor-fold defaultstate="collapsed" desc="Getter and Setters. Click on the + sign on the left to edit the code.">
    public Integer getIdActvidad() {
        return idActvidad;
    }

    public void setIdActvidad(Integer idActvidad) {
        this.idActvidad = idActvidad;
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
    }// </editor-fold>
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActvidad != null ? idActvidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividaddeporte)) {
            return false;
        }
        Actividaddeporte other = (Actividaddeporte) object;
        if ((this.idActvidad == null && other.idActvidad != null) || (this.idActvidad != null && !this.idActvidad.equals(other.idActvidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.proyectoimd.domain.Actividaddeporte[ idActvidad=" + idActvidad + " ]";
    }
    
}
