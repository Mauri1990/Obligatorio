/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.Tramo;

/**
 *
 * @author Mauricio
 */
public class nodoListaTramo 
{

    public Tramo getTramo() {
        return dato;
    }

    public void setTramo(Tramo dato) {
        this.dato = dato;
    }

    public nodoListaTramo getSig() {
        return sig;
    }

    public void setSig(nodoListaTramo sig) {
        this.sig = sig;
    }
    private nodoListaTramo sig;
    private Tramo dato;

    public nodoListaTramo( Tramo dato) {
        this.sig = null;
        this.dato = dato;
    }
    
}
