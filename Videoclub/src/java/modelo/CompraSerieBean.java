
package modelo;

import controlador.CompraSeriePojo;
import controlador.CompraserieFacade;
import controlador.DetalleCompraSeriePojo;
import controlador.DetallecompraserieFacade;
import entidad.Compraserie;
import entidad.Usuario;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@Named(value = "compraSerieBean")
@RequestScoped
public class CompraSerieBean {

    private int idCompraSerie;
    private Usuario idUsuario;
    private double total_compra;
    private Date fecha_compra;
    private Date fecha_entrega;
    
    private CompraserieFacade compraSerieFacade;
    private DetallecompraserieFacade detalleSerieFacade;
    
    public CompraSerieBean() {
        
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
    
    public String crearCompra(String correo) {
        if (!correo.equals("")) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            UserLog neededBean = (UserLog) facesContext.getApplication().createValueBinding("#{userLog}").getValue(facesContext);
            if (neededBean.getIdCompraSerie()==0) {
                Calendar fecha = Calendar.getInstance();
                Date now = fecha.getTime();
                fecha.add(Calendar.DAY_OF_YEAR, 30);
                Date agregado = fecha.getTime();
                FacesContext context = FacesContext.getCurrentInstance();
                CompraSeriePojo compra = new CompraSeriePojo();
                compra.setIdCompraSerie(idCompraSerie);
                compra.setIdUsuario(idUsuario);
                compra.setFecha_compra(now);
                compra.setFecha_entrega(agregado);
                compra.setTotal_compra(0);
                compraSerieFacade = new CompraserieFacade();
                Compraserie compraN = compraSerieFacade.crearCompra(compra, correo);
                setIdCompraSerie(compraN.getIdCompraSerie());
                setIdUsuario(compraN.getIdUsuario());
                setTotal_compra(compraN.getTotalCompra());
                setFecha_compra(compraN.getFechaCompra());
                setFecha_entrega(compraN.getFechaEntrega());
                neededBean.setIdCompraSerie(compraN.getIdCompraSerie());
                System.out.println(neededBean.getCorreo());
            }else{
                setIdCompraSerie(neededBean.getIdCompra());
            }
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            String txtProperty = request.getParameter("myForm:movie");
            int idPeli = Integer.parseInt(txtProperty);
            agregarCarrito(idPeli);
            return "carrito";
        }
        return "Login";
    }

    public void agregarCarrito(int idSerie) {
        try {
            System.out.println("LA serie es-----------------" + idSerie);
            DetalleCompraSeriePojo detalle = new DetalleCompraSeriePojo();
            detalleSerieFacade = new DetallecompraserieFacade();
            detalle.setIdDetalleCompraSerie(idCompraSerie);
            detalle.setIdCompraSerie(detalleSerieFacade.getCompra(idCompraSerie));
            detalle.setIdSerie(detalleSerieFacade.getSerie(idSerie));
            detalle.setSubtotal(detalleSerieFacade.getSerie(idSerie).getPrecio());
            detalleSerieFacade.create(detalle);
            Compraserie editable = detalleSerieFacade.getCompra(idCompraSerie);
            editable.setTotalCompra((double)Math.round((editable.getTotalCompra()+detalle.getSubtotal())* 100d)/100d);
            System.out.println(editable.getTotalCompra()+ "Total de compraXDXDXDXD");
            compraSerieFacade = new CompraserieFacade();
            compraSerieFacade.update(editable);
        } catch (Exception ex) {
            Logger.getLogger(CompraBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
