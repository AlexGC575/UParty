package evento;
// Generated 30-may-2023 21:57:04 by Hibernate Tools 4.3.1



/**
 * Mensaje generated by hbm2java
 */
public class Mensaje  implements java.io.Serializable {


     private Integer id;
     private Usuario usuario;
     private String contenido;

    public Mensaje() {
    }

    public Mensaje(Usuario usuario, String contenido) {
       this.usuario = usuario;
       this.contenido = contenido;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }




}


