package modelo.entidad;
// Generated 20 oct. 2022 21:02:22 by Hibernate Tools 4.3.1



/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private Integer idEstudiante;
     private String nombre;
     private String apellido;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido) {
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
    public Integer getIdEstudiante() {
        return this.idEstudiante;
    }
    
    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}


