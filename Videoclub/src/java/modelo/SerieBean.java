
package modelo;

import entidad.Categoria;
import javax.inject.Named;
import controlador.SerieFacade;
import controlador.SeriePojo;
import javax.enterprise.context.RequestScoped;

@Named(value = "serieBean")
@RequestScoped
public class SerieBean {

    private int idSerie;
    private Categoria idCategoria;
    private String titulo;
    private String sinopsis;
    private double precio;
    private double rating;
    private int numero_temporadas;
    private String categoria_nombre;
    
    private SerieFacade serieFacade;
    private SeriePojo seriePojo;
    
    public SerieBean() {
        
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }
    
    public String getCategoria_nombre() {
        return categoria_nombre;
    }

    public void setCategoria_nombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }
    
    public String buscar(int id) {
        setIdSerie(id);
        serieFacade = new SerieFacade();
        seriePojo = serieFacade.buscarSerie(idSerie);
        setIdSerie(seriePojo.getIdSerie());
        setNumero_temporadas(seriePojo.getNumero_temporadas());
        setPrecio(seriePojo.getPrecio());
        setRating(seriePojo.getRating());
        setSinopsis(seriePojo.getSinopsis());
        setTitulo(seriePojo.getTitulo());
        setIdCategoria(seriePojo.getIdCategoria());
        setCategoria_nombre(seriePojo.getIdCategoria().getNombreCategoria());
        return "descripcion_serie";
    }
}
