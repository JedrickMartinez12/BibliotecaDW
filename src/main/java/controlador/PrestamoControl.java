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
import modelo.dao.PrestamoDao;
import modelo.entidad.Prestamo;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class PrestamoControl {

    /**
     * Creates a new instance of PrestamoControl
     */
    private List<Prestamo> listaPrestamos;
    private Prestamo prestamo;

    public PrestamoControl() {
        prestamo = new Prestamo();
    }

    public List<Prestamo> getListaPrestamos() {
        PrestamoDao ad = new PrestamoDao();
        listaPrestamos = ad.listarPrestamo();
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void limpiarPrestamo() {
        prestamo = new Prestamo();
    }

    public void agregarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.agregar(prestamo);      
    }

    public void modificarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.modificar(prestamo);
        limpiarPrestamo();
    }

    public void eliminarPrestamo() {
        PrestamoDao ad = new PrestamoDao();
        ad.eliminar(prestamo);
        limpiarPrestamo();
    }
}
