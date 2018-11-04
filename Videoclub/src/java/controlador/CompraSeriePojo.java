
package controlador;

import entidad.Usuario;
import java.util.Date;

public class CompraSeriePojo {
    
    private int idCompraSerie;
    private Usuario idUsuario;
    private double total_compra;
    private Date fecha_compra;
    private Date fecha_entrega;
       
    public CompraSeriePojo() {
        
    }

    public int getIdCompraSerie() {
        return idCompraSerie;
    }

    public void setIdCompraSerie(int idCompraSerie) {
        this.idCompraSerie = idCompraSerie;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(double total_compra) {
        this.total_compra = total_compra;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
}
