
package controlador;

import entidad.Comprapelicula;
import entidad.Pelicula;

public class DetalleCompraPojo {
    private int idDetalleCompra;
    private Comprapelicula idCompra;
    private Pelicula idPelicula;
    private double subtotal;

    public DetalleCompraPojo() {
        
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
