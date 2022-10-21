package modelo.entidad;
// Generated 20 oct. 2022 21:02:22 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Prestamo generated by hbm2java
 */
public class Prestamo  implements java.io.Serializable {


     private Integer idPrestamo;
     private Date fechaPrestamo;
     private Date fechaDevolucion;
     private int codEstudiante;
     private int codLibro;

    public Prestamo() {
    }

	
    public Prestamo(Date fechaPrestamo, int codEstudiante, int codLibro) {
        this.fechaPrestamo = fechaPrestamo;
        this.codEstudiante = codEstudiante;
        this.codLibro = codLibro;
    }
    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, int codEstudiante, int codLibro) {
       this.fechaPrestamo = fechaPrestamo;
       this.fechaDevolucion = fechaDevolucion;
       this.codEstudiante = codEstudiante;
       this.codLibro = codLibro;
    }
   
    public Integer getIdPrestamo() {
        return this.idPrestamo;
    }
    
    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public Date getFechaPrestamo() {
        return this.fechaPrestamo;
    }
    
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public int getCodEstudiante() {
        return this.codEstudiante;
    }
    
    public void setCodEstudiante(int codEstudiante) {
        this.codEstudiante = codEstudiante;
    }
    public int getCodLibro() {
        return this.codLibro;
    }
    
    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }




}

