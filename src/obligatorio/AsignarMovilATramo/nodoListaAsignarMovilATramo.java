/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.AsignarMovilATramo;

/**
 *
 * @author Mauricio
 */
public class nodoListaAsignarMovilATramo 
{

    public AsignarMovilTramo getAsignarMovilTramo() {
        return dato;
    }

    public void setAsignarMovilTramo(AsignarMovilTramo dato) {
        this.dato = dato;
    }

    public nodoListaAsignarMovilATramo getSig() {
        return sig;
    }

    public void setSig(nodoListaAsignarMovilATramo sig) {
        this.sig = sig;
    }
     private AsignarMovilTramo dato;
    private nodoListaAsignarMovilATramo sig;

    public nodoListaAsignarMovilATramo(AsignarMovilTramo dato) {
        this.dato = dato;
        this.sig = null;
    }
    
    
}
