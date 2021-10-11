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
@Table(name = "direccion")
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d"),
    @NamedQuery(name = "Direccion.findByIdDireccion", query = "SELECT d FROM Direccion d WHERE d.idDireccion = :idDireccion"),
    @NamedQuery(name = "Direccion.findByCalleDireccion", query = "SELECT d FROM Direccion d WHERE d.calleDireccion = :calleDireccion"),
    @NamedQuery(name = "Direccion.findByNumeroDireccion", query = "SELECT d FROM Direccion d WHERE d.numeroDireccion = :numeroDireccion"),
    @NamedQuery(name = "Direccion.findByBloqueDireccion", query = "SELECT d FROM Direccion d WHERE d.bloqueDireccion = :bloqueDireccion"),
    @NamedQuery(name = "Direccion.findByPortalDireccion", query = "SELECT d FROM Direccion d WHERE d.portalDireccion = :portalDireccion"),
    @NamedQuery(name = "Direccion.findByPisoDireccion", query = "SELECT d FROM Direccion d WHERE d.pisoDireccion = :pisoDireccion"),
    @NamedQuery(name = "Direccion.findByPuertaDireccion", query = "SELECT d FROM Direccion d WHERE d.puertaDireccion = :puertaDireccion"),
    @NamedQuery(name = "Direccion.findByLocalidadDireccion", query = "SELECT d FROM Direccion d WHERE d.localidadDireccion = :localidadDireccion"),
    @NamedQuery(name = "Direccion.findByCpDireccion", query = "SELECT d FROM Direccion d WHERE d.cpDireccion = :cpDireccion"),
    @NamedQuery(name = "Direccion.findByProvinciaDireccion", query = "SELECT d FROM Direccion d WHERE d.provinciaDireccion = :provinciaDireccion")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_direccion")
    private Integer idDireccion;
    @Size(max = 45)
    @Column(name = "calle_direccion")
    private String calleDireccion;
    @Size(max = 45)
    @Column(name = "numero_direccion")
    private String numeroDireccion;
    @Size(max = 45)
    @Column(name = "bloque_direccion")
    private String bloqueDireccion;
    @Size(max = 45)
    @Column(name = "portal_direccion")
    private String portalDireccion;
    @Size(max = 45)
    @Column(name = "piso_direccion")
    private String pisoDireccion;
    @Size(max = 45)
    @Column(name = "puerta_direccion")
    private String puertaDireccion;
    @Size(max = 45)
    @Column(name = "localidad_direccion")
    private String localidadDireccion;
    @Size(max = 45)
    @Column(name = "cp_direccion")
    private String cpDireccion;
    @Size(max = 45)
    @Column(name = "provincia_direccion")
    private String provinciaDireccion;
    @OneToMany(mappedBy = "iddireccionEntrenador", fetch = FetchType.LAZY)
    private List<Entrenador> entrenadorList;

    public Direccion() {
    }

    public Direccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public String getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(String numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getBloqueDireccion() {
        return bloqueDireccion;
    }

    public void setBloqueDireccion(String bloqueDireccion) {
        this.bloqueDireccion = bloqueDireccion;
    }

    public String getPortalDireccion() {
        return portalDireccion;
    }

    public void setPortalDireccion(String portalDireccion) {
        this.portalDireccion = portalDireccion;
    }

    public String getPisoDireccion() {
        return pisoDireccion;
    }

    public void setPisoDireccion(String pisoDireccion) {
        this.pisoDireccion = pisoDireccion;
    }

    public String getPuertaDireccion() {
        return puertaDireccion;
    }

    public void setPuertaDireccion(String puertaDireccion) {
        this.puertaDireccion = puertaDireccion;
    }

    public String getLocalidadDireccion() {
        return localidadDireccion;
    }

    public void setLocalidadDireccion(String localidadDireccion) {
        this.localidadDireccion = localidadDireccion;
    }

    public String getCpDireccion() {
        return cpDireccion;
    }

    public void setCpDireccion(String cpDireccion) {
        this.cpDireccion = cpDireccion;
    }

    public String getProvinciaDireccion() {
        return provinciaDireccion;
    }

    public void setProvinciaDireccion(String provinciaDireccion) {
        this.provinciaDireccion = provinciaDireccion;
    }

    public List<Entrenador> getEntrenadorList() {
        return entrenadorList;
    }

    public void setEntrenadorList(List<Entrenador> entrenadorList) {
        this.entrenadorList = entrenadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.proyectoimd.domain.Direccion[ idDireccion=" + idDireccion + " ]";
    }
    
}
