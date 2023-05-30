package evento;
// Generated 30-may-2023 21:57:04 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private PagoId id;
     private Usuario usuario;
     private Date caducidad;

    public Pago() {
    }

    public Pago(PagoId id, Usuario usuario, Date caducidad) {
       this.id = id;
       this.usuario = usuario;
       this.caducidad = caducidad;
    }
   
    public PagoId getId() {
        return this.id;
    }
    
    public void setId(PagoId id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getCaducidad() {
        return this.caducidad;
    }
    
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }




}


