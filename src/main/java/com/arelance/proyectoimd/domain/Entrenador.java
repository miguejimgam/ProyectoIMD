/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "entrenador")
@NamedQueries({
    @NamedQuery(name = "Entrenador.findAll", query = "SELECT e FROM Entrenador e"),
    @NamedQuery(name = "Entrenador.findByIdEntrenador", query = "SELECT e FROM Entrenador e WHERE e.idEntrenador = :idEntrenador"),
    @NamedQuery(name = "Entrenador.findByNickEntrenador", query = "SELECT e FROM Entrenador e WHERE e.nickEntrenador = :nickEntrenador"),
    @NamedQuery(name = "Entrenador.findByCorreoEntrenador", query = "SELECT e FROM Entrenador e WHERE e.correoEntrenador = :correoEntrenador"),
    @NamedQuery(name = "Entrenador.findByPasswordEntrenador", query = "SELECT e FROM Entrenador e WHERE e.passwordEntrenador = :passwordEntrenador"),
    @NamedQuery(name = "Entrenador.findByNombreEntrenador", query = "SELECT e FROM Entrenador e WHERE e.nombreEntrenador = :nombreEntrenador"),
    @NamedQuery(name = "Entrenador.findByApellidoEntrenador", query = "SELECT e FROM Entrenador e WHERE e.apellidoEntrenador = :apellidoEntrenador"),
    @NamedQuery(name = "Entrenador.findByTelefonoEntrenador", query = "SELECT e FROM Entrenador e WHERE e.telefonoEntrenador = :telefonoEntrenador")})
public class Entrenador implements Serializable {

    @Size(max = 45)
    @Column(name = "nick_entrenador")
    private String nickEntrenador;
    @Size(max = 45)
    @Column(name = "correo_entrenador")
    private String correoEntrenador;
    @Size(max = 45)
    @Column(name = "password_entrenador")
    private String passwordEntrenador;
    @Size(max = 45)
    @Column(name = "nombre_entrenador")
    private String nombreEntrenador;
    @Size(max = 45)
    @Column(name = "apellido_entrenador")
    private String apellidoEntrenador;
    @Size(max = 45)
    @Column(name = "telefono_entrenador")
    private String telefonoEntrenador;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrenador")
    private Integer idEntrenador;
    @OneToMany(mappedBy = "entrenador", fetch = FetchType.LAZY)
    private List<ActividadDeporte> actividadDeporteList;
    @JoinColumn(name = "iddireccion_entrenador", referencedColumnName = "id_direccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Direccion iddireccionEntrenador;

    public Entrenador() {
    }

    public Entrenador(Integer idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public Integer getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Integer idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNickEntrenador() {
        return nickEntrenador;
    }

    public void setNickEntrenador(String nickEntrenador) {
        this.nickEntrenador = nickEntrenador;
    }

    public String getCorreoEntrenador() {
        return correoEntrenador;
    }

    public void setCorreoEntrenador(String correoEntrenador) {
        this.correoEntrenador = correoEntrenador;
    }

    public String getPasswordEntrenador() {
        return passwordEntrenador;
    }

    public void setPasswordEntrenador(String passwordEntrenador) {
        this.passwordEntrenador = passwordEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public String getTelefonoEntrenador() {
        return telefonoEntrenador;
    }

    public void setTelefonoEntrenador(String telefonoEntrenador) {
        this.telefonoEntrenador = telefonoEntrenador;
    }

    public List<ActividadDeporte> getActividadDeporteList() {
        return actividadDeporteList;
    }

    public void setActividadDeporteList(List<ActividadDeporte> actividadDeporteList) {
        this.actividadDeporteList = actividadDeporteList;
    }

    public Direccion getIddireccionEntrenador() {
        return iddireccionEntrenador;
    }

    public void setIddireccionEntrenador(Direccion iddireccionEntrenador) {
        this.iddireccionEntrenador = iddireccionEntrenador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntrenador != null ? idEntrenador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenador)) {
            return false;
        }
        Entrenador other = (Entrenador) object;
        if ((this.idEntrenador == null && other.idEntrenador != null) || (this.idEntrenador != null && !this.idEntrenador.equals(other.idEntrenador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.proyectoimd.domain.Entrenador[ idEntrenador=" + idEntrenador + " ]";
    }
    
}
