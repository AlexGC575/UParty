package evento;
// Generated May 30, 2023 1:23:05 PM by Hibernate Tools 4.3.1

import java.math.BigInteger;




/**
 * PagoId generated by hbm2java
 */
public class PagoId  implements java.io.Serializable {


     private String tarjetoCredito;
     private String usuario;

    public PagoId() {
    }

    public PagoId(String tarjetoCredito, String usuario) {
       this.tarjetoCredito = tarjetoCredito;
       this.usuario = usuario;
    }
   
    public String getTarjetoCredito() {
        return this.tarjetoCredito;
    }
    
    public void setTarjetoCredito(String tarjetoCredito) {
        this.tarjetoCredito = tarjetoCredito;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PagoId) ) return false;
		 PagoId castOther = ( PagoId ) other; 
         
		 return (this.getTarjetoCredito().equals(castOther.getTarjetoCredito()))
 && ( (this.getUsuario().equals(castOther.getUsuario())) || ( this.getUsuario()!=null && castOther.getUsuario()!=null && this.getUsuario().equals(castOther.getUsuario()) ) );
   }
   

}


