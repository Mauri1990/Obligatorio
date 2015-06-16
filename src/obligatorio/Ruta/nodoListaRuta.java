/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.Ruta;

/**
 *
 * @author Mauricio
 */
public class nodoListaRuta 
{

    public Ruta getDato() {
        return dato;
    }

    public void setDato(Ruta dato) {
        this.dato = dato;
    }

    public nodoListaRuta getSig() {
        return sig;
    }

    public void setSig(nodoListaRuta sig) {
        this.sig = sig;
    }
    private Ruta dato;
    private nodoListaRuta sig;

    public nodoListaRuta(Ruta dato) 
    {
        this.dato = dato;
        this.sig = null;
    }
    
}
