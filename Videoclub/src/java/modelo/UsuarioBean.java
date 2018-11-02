/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.UsuarioFacade;
import entidad.Usuario;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author tigre
 */
@Named(value = "bean")
@RequestScoped
public class UsuarioBean {

    private int idUsuario;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String calle;
    private String contraseña;
    private String correo;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNo_int() {
        return no_int;
    }

    public void setNo_int(String no_int) {
        this.no_int = no_int;
    }

    public String getNo_ext() {
        return no_ext;
    }

    public void setNo_ext(String no_ext) {
        this.no_ext = no_ext;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public FacesContext getFc() {
        return fc;
    }

    public void setFc(FacesContext fc) {
        this.fc = fc;
    }

    public ExternalContext getEc() {
        return ec;
    }

    public void setEc(ExternalContext ec) {
        this.ec = ec;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    private String no_int;
    private String no_ext;
    private String cp;
    private String celular;
    private String telefono_fijo;

    private UsuarioFacade usuarioFacade = new UsuarioFacade();
    private FacesContext fc = FacesContext.getCurrentInstance();
    private ExternalContext ec = fc.getExternalContext();
    private Usuario usuario = new Usuario();

    /**
     * Creates a new instance of Bean
     */
    public UsuarioBean() {
    }

    public void alta() {

        if (nombre.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu nombre"));
        }else if (contraseña.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu contraseña"));
        } else if (apellidoP.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu ap"));
        } else if (apellidoM.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu am"));
        } else if (correo.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu correo"));
        } else if (calle.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu pass"));
        } else if (no_int.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu numero interior"));
        }else if (no_ext.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu numero exteior"));
        } else if (cp.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu codigo postal"));
        } else if (celular.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu celular"));
        }  else if (telefono_fijo.equals("")) {
            fc.addMessage("", new FacesMessage("Te falta escribir tu telefono fijo"));
        } else {
            Usuario user = new Usuario(idUsuario,nombre, contraseña, apellidoP, apellidoM, correo ,calle, no_int, no_ext, cp, celular, telefono_fijo);
            usuarioFacade.crearUsuario(user);
            fc.addMessage("", new FacesMessage("Se registro correctamente"));
        }
    }

    public String buscaByidUsuario() {
        Usuario usuarios;
        usuarios = usuarioFacade.buscarPoridUsuario(idUsuario);

        if (usuarios != null) {
            this.idUsuario = usuarios.getIdUsuario();
            this.nombre = usuarios.getNombre();
            this.contraseña = usuarios.getContraseña();
            this.apellidoP = usuarios.getApellidoP();
            this.apellidoM = usuarios.getApellidoM();
            this.correo = usuarios.getCorreo();
            this.calle = usuarios.getCalle();
            this.no_int = usuarios.getNoInt();
            this.no_ext = usuarios.getNoExt();
            this.cp = usuarios.getCp();
            this.celular = usuarios.getCelular();
            this.telefono_fijo = usuarios.getTelefonoFijo();
            return "Resultado";
        }
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage("", new FacesMessage("No existe un amigo con ese telefono"));
        return null;
    }

}
