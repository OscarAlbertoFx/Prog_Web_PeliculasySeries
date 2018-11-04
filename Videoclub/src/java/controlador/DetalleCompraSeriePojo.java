
package controlador;

import entidad.Compraserie;
import entidad.Serie;

public class DetalleCompraSeriePojo {
    
    private int idDetalleCompraSerie;
    private Compraserie idCompraSerie;
    private Serie idSerie;
    private double subtotal;
    
    public DetalleCompraSeriePojo() {
        
    }

    public int getIdDetalleCompraSerie() {
        return idDetalleCompraSerie;
    }

    public void setIdDetalleCompraSerie(int idDetalleCompraSerie) {
        this.idDetalleCompraSerie = idDetalleCompraSerie;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
