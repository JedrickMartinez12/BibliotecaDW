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
import modelo.dao.Vista2Dao;
import modelo.entidad.Vista2;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class Vista2Control {

    /**
     * Creates a new instance of Vista2Control
     */
    private List<Vista2> listaVista2s;
    private Vista2 vista2;

    public Vista2Control() {
        vista2 = new Vista2();
    }

    public List<Vista2> getListaVista2s() {
        Vista2Dao ad = new Vista2Dao();
        listaVista2s = ad.listarVista2();
        return listaVista2s;
    }

    public void setListaVista2s(List<Vista2> listaVista2s) {
        this.listaVista2s = listaVista2s;
    }

    public Vista2 getVista2() {
        return vista2;
    }

    public void setVista2(Vista2 vista2) {
        this.vista2 = vista2;
    }

    public void limpiarVista2() {
        vista2 = new Vista2();
    }
}
