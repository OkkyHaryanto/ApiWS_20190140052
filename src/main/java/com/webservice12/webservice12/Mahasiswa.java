/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice12.webservice12;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findById", query = "SELECT m FROM Mahasiswa m WHERE m.id = :id"),
    @NamedQuery(name = "Mahasiswa.findByNamamahasiswa", query = "SELECT m FROM Mahasiswa m WHERE m.namamahasiswa = :namamahasiswa"),
    @NamedQuery(name = "Mahasiswa.findByAlamatmahasiswa", query = "SELECT m FROM Mahasiswa m WHERE m.alamatmahasiswa = :alamatmahasiswa"),
    @NamedQuery(name = "Mahasiswa.findByProgramstudi", query = "SELECT m FROM Mahasiswa m WHERE m.programstudi = :programstudi"),
    @NamedQuery(name = "Mahasiswa.findByFakultas", query = "SELECT m FROM Mahasiswa m WHERE m.fakultas = :fakultas")})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "namamahasiswa")
    private String namamahasiswa;
    @Column(name = "alamatmahasiswa")
    private String alamatmahasiswa;
    @Column(name = "programstudi")
    private String programstudi;
    @Column(name = "fakultas")
    private String fakultas;

    public Mahasiswa() {
    }

    public Mahasiswa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamamahasiswa() {
        return namamahasiswa;
    }

    public void setNamamahasiswa(String namamahasiswa) {
        this.namamahasiswa = namamahasiswa;
    }

    public String getAlamatmahasiswa() {
        return alamatmahasiswa;
    }

    public void setAlamatmahasiswa(String alamatmahasiswa) {
        this.alamatmahasiswa = alamatmahasiswa;
    }

    public String getProgramstudi() {
        return programstudi;
    }

    public void setProgramstudi(String programstudi) {
        this.programstudi = programstudi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.webservice12.webservice12.Mahasiswa[ id=" + id + " ]";
    }
    
}
