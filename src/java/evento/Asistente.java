package evento;
// Generated 30-may-2023 21:57:04 by Hibernate Tools 4.3.1



/**
 * Asistente generated by hbm2java
 */
public class Asistente  implements java.io.Serializable {


     private Integer id;
     private Evento evento;
     private String nombre;
     private String apellidos;

    public Asistente() {
    }

    public Asistente(Evento evento, String nombre, String apellidos) {
       this.evento = evento;
       this.nombre = nombre;
       this.apellidos = apellidos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }




}


