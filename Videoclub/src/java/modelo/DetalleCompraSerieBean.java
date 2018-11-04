package modelo;

import controlador.ComprapeliculaFacade;
import controlador.CompraserieFacade;
import controlador.DetallecomprapeliculaFacade;
import controlador.DetallecompraserieFacade;
import entidad.Compraserie;
import entidad.Detallecompraserie;
import entidad.Serie;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

@Named(value = "detalleCompraSerieBean")
@RequestScoped
public class DetalleCompraSerieBean {

    private int idDetalleCompraSerie;
    private Compraserie idCompraSerie;
    private Serie idSerie;
    private double subtotal;

    private List<Detallecompraserie> valores;

    private DetallecompraserieFacade detalleFacade;
    private CompraserieFacade compraFacade;
    private double total_pago;

    public DetalleCompraSerieBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UserLog neededBean = (UserLog) facesContext.getApplication().createValueBinding("#{userLog}").getValue(facesContext);
        detalleFacade = new DetallecompraserieFacade();
        this.valores = detalleFacade.filtrar(detalleFacade.getCompra(neededBean.getIdCompraSerie()));
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

    public List<Detallecompraserie> getValores() {
        return valores;
    }

    public void setValores(List<Detallecompraserie> valores) {
        this.valores = valores;
    }

}
