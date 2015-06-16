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
public class listaTramo 
{

    public nodoListaTramo getInicio() {
        return inicio;
    }

    public void setInicio(nodoListaTramo inicio) {
        this.inicio = inicio;
    }
    private nodoListaTramo inicio;
    
    public void agregarAlfinal(Tramo pTra)
    {
        nodoListaTramo nuevoNodo= new nodoListaTramo(pTra);
        nodoListaTramo aux=getInicio();
        
        while(aux.getSig()!=null)
        {
            aux=aux.getSig();
        }
        aux.setSig(nuevoNodo);
    }
    public void agregarAlprincipio(Tramo pTra)
    {
        nodoListaTramo nuevoNodo= new nodoListaTramo(pTra);
        nuevoNodo.setSig(inicio);
        inicio=nuevoNodo;
    }
    public nodoListaTramo buscarTramo(String CiudOr, String CiuDest)
    {
        boolean pertenece = false;
        nodoListaTramo auxTramo= null;
        nodoListaTramo aux=inicio;
        
        while(aux.getSig()!=null && !pertenece)
        {
            if (aux.getTramo().getCiudadOrigen().equals(CiudOr) && aux.getTramo().getCiudadDestino().equals(CiuDest))
            {
                pertenece=true;
                auxTramo= aux;
            }
            aux=aux.getSig();
        }
        if (aux.getTramo().getCiudadOrigen().equals(CiudOr) && aux.getTramo().getCiudadDestino().equals(CiuDest))
        {
            pertenece=true;
            auxTramo=aux;
        }
        return auxTramo;
    }
    public void listarNodo()
    {
        nodoListaTramo aux= getInicio();
        
        while(aux.getSig()!=null)
        {
            System.out.println(aux.getTramo().getCiudadOrigen() + aux.getTramo().getCiudadDestino());
            aux=aux.getSig();
        }
        System.out.println(aux.getTramo().getCiudadOrigen() + aux.getTramo().getCiudadDestino());
    }
    public void eliminarTramo(Tramo pTra)
    {
        nodoListaTramo aux= inicio, ant=inicio;
        nodoListaTramo pEliminar=buscarTramo(pTra.getCiudadOrigen(),pTra.getCiudadDestino());
        
        while(aux!=pEliminar)
        {
            ant=aux;
            aux=aux.getSig();
        }
        if (aux==inicio)
        {
            inicio=pEliminar.getSig();
        }
        else
        {
            ant.setSig(pEliminar.getSig());
        }
    }
}
