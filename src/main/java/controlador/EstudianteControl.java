/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.EstudianteDao;
import modelo.entidad.Estudiante;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class EstudianteControl {

    /**
     * Creates a new instance of EstudianteControl
     */
    private List<Estudiante> listaEstudiantes;
    private Estudiante estudiante;

    public EstudianteControl() {
        estudiante = new Estudiante();
    }

    public List<Estudiante> getListaEstudiantes() {
        EstudianteDao ad = new EstudianteDao();
        listaEstudiantes = ad.listarEstudiante();
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void limpiarEstudiante() {
        estudiante = new Estudiante();
    }

    public void agregarEstudiante() {
        EstudianteDao ad = new EstudianteDao();
        ad.agregar(estudiante);      
    }

    public void modificarEstudiante() {
        EstudianteDao ad = new EstudianteDao();
        ad.modificar(estudiante);
        limpiarEstudiante();
    }

    public void eliminarEstudiante() {
        EstudianteDao ad = new EstudianteDao();
        ad.eliminar(estudiante);
        limpiarEstudiante();
    }
}
