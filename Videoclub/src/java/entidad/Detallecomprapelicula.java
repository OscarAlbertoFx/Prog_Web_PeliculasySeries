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
@Table(name = "detallecomprapelicula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecomprapelicula.findAll", query = "SELECT d FROM Detallecomprapelicula d")
    , @NamedQuery(name = "Detallecomprapelicula.findByIdDetalleCompra", query = "SELECT d FROM Detallecomprapelicula d WHERE d.idDetalleCompra = :idDetalleCompra")
    , @NamedQuery(name = "Detallecomprapelicula.findBySubtotal", query = "SELECT d FROM Detallecomprapelicula d WHERE d.subtotal = :subtotal")})
public class Detallecomprapelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleCompra")
    private Integer idDetalleCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subtotal")
    private double subtotal;
    @JoinColumn(name = "idCompra", referencedColumnName = "idCompra")
    @ManyToOne(optional = false)
    private Comprapelicula idCompra;
    @JoinColumn(name = "idPelicula", referencedColumnName = "idPelicula")
    @ManyToOne(optional = false)
    private Pelicula idPelicula;

    public Detallecomprapelicula() {
    }

    public Detallecomprapelicula(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public Detallecomprapelicula(Integer idDetalleCompra, double subtotal) {
        this.idDetalleCompra = idDetalleCompra;
        this.subtotal = subtotal;
    }

    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Comprapelicula getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Comprapelicula idCompra) {
        this.idCompra = idCompra;
    }

    public Pelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Pelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCompra != null ? idDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecomprapelicula)) {
            return false;
        }
        Detallecomprapelicula other = (Detallecomprapelicula) object;
        if ((this.idDetalleCompra == null && other.idDetalleCompra != null) || (this.idDetalleCompra != null && !this.idDetalleCompra.equals(other.idDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Detallecomprapelicula[ idDetalleCompra=" + idDetalleCompra + " ]";
    }
    
}
