/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.Movil;

/**
 *
 * @author Mauricio
 */
public class nodoListaMovil 
{

    public Movil getMovil() {
        return dato;
    }

    public void setMovil(Movil dato) {
        this.dato = dato;
    }

    public nodoListaMovil getSig() {
        return sig;
    }

    public void setSig(nodoListaMovil sig) {
        this.sig = sig;
    }
    private Movil dato;
    private nodoListaMovil sig;

    public nodoListaMovil(Movil dato) {
        this.dato = dato;
        this.sig = null;
    }
    
    
}
