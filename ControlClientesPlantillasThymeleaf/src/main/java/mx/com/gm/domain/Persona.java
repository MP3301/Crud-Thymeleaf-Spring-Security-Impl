package mx.com.gm.domain;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{

   public Persona() {
   }

   public Persona(Long idPersona, String nombre, String apellido, String email, String telefono) {
      this.idPersona = idPersona;
      this.nombre = nombre;
      this.apellido = apellido;
      this.email = email;
      this.telefono = telefono;
   }
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String apellido;
    
    @NotNull
    private String email;
    
    private String telefono;
}
