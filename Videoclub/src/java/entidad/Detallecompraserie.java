/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aaron
 */
@Entity
@Table(name = "detallecompraserie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecompraserie.findAll", query = "SELECT d FROM Detallecompraserie d")
    , @NamedQuery(name = "Detallecompraserie.findByIdDetalleCompraSerie", query = "SELECT d FROM Detallecompraserie d WHERE d.idDetalleCompraSerie = :idDetalleCompraSerie")
    , @NamedQuery(name = "Detallecompraserie.findBySubtotal", query = "SELECT d FROM Detallecompraserie d WHERE d.subtotal = :subtotal")})
public class Detallecompraserie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleCompraSerie")
    private Integer idDetalleCompraSerie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private double subtotal;
    @JoinColumn(name = "idCompraSerie", referencedColumnName = "idCompraSerie")
    @ManyToOne(optional = false)
    private Compraserie idCompraSerie;
    @JoinColumn(name = "idSerie", referencedColumnName = "idSerie")
    @ManyToOne(optional = false)
    private Serie idSerie;

    public Detallecompraserie() {
    }

    public Detallecompraserie(Integer idDetalleCompraSerie) {
        this.idDetalleCompraSerie = idDetalleCompraSerie;
    }

    public Detallecompraserie(Integer idDetalleCompraSerie, double subtotal) {
        this.idDetalleCompraSerie = idDetalleCompraSerie;
        this.subtotal = subtotal;
    }

    public Integer getIdDetalleCompraSerie() {
        return idDetalleCompraSerie;
    }

    public void setIdDetalleCompraSerie(Integer idDetalleCompraSerie) {
        this.idDetalleCompraSerie = idDetalleCompraSerie;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Compraserie getIdCompraSerie() {
        return idCompraSerie;
    }

    public void setIdCompraSerie(Compraserie idCompraSerie) {
        this.idCompraSerie = idCompraSerie;
    }

    public Serie getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Serie idSerie) {
        this.idSerie = idSerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCompraSerie != null ? idDetalleCompraSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecompraserie)) {
            return false;
        }
        Detallecompraserie other = (Detallecompraserie) object;
        if ((this.idDetalleCompraSerie == null && other.idDetalleCompraSerie != null) || (this.idDetalleCompraSerie != null && !this.idDetalleCompraSerie.equals(other.idDetalleCompraSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Detallecompraserie[ idDetalleCompraSerie=" + idDetalleCompraSerie + " ]";
    }
    
}
