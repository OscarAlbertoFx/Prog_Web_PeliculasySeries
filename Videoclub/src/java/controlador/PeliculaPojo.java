/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Categoria;

/**
 *
 * @author aaron
 */
public class PeliculaPojo {
    private int idPelicula;
    private String sinopsis;
    private String titulo;
    private String clasificacion;
    private double rating;
    private String director;
    private Categoria idCategoria;
    private double precio_compra;
    private double precio_renta;
    private String año;
    private String duracion;
    private int cantidad_almacen;
    private int cantidad_renta;
    private String categoria_nombre;
           
    public PeliculaPojo() {
    }
    
    public int getIdPelicula() {
        return idPelicula;
    }
    
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }
    
    public String getSinopsis() {
        return sinopsis;
    }
    
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }
    
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public Categoria getIdCategoria() {
        return idCategoria;
    }
    
    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public double getPrecio_compra() {
        return precio_compra;
    }
    
    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
    
    public double getPrecio_renta() {
        return precio_renta;
    }
    
    public void setPrecio_renta(double precio_renta) {
        this.precio_renta = precio_renta;
    }
    
    public String getAño() {
        return año;
    }
    
    public void setAño(String año) {
        this.año = año;
    }
    
    public String getDuracion() {
        return duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    public int getCantidad_almacen() {
        return cantidad_almacen;
    }
    
    public void setCantidad_almacen(int cantidad_almacen) {
        this.cantidad_almacen = cantidad_almacen;
    }
    
    public int getCantidad_rentas() {
        return cantidad_renta;
    }
    
    public void setCantidad_rentas(int cantidad_renta) {
        this.cantidad_renta = cantidad_renta;
    }

    public String getCategoria_nombre() {
        return categoria_nombre;
    }

    public void setCategoria_nombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }
    
}
