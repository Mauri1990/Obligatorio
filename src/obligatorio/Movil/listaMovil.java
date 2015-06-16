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
public class listaMovil 
{

    public static nodoListaMovil getInicio() {
        return inicio;
    }

    public void setInicio(nodoListaMovil inicio) {
        this.inicio = inicio;
    }
    private static nodoListaMovil inicio;
    
    public void agregarAlfinal(Movil pMov)
    {
        nodoListaMovil nuevoNodo= new nodoListaMovil(pMov);
        nodoListaMovil aux= getInicio();
        
        while(aux.getSig()!=null)
        {
            aux=aux.getSig();
        }
        aux.setSig(nuevoNodo);
    }
    public void agregarAlprincipio(Movil pMov)
    {
        nodoListaMovil nuevoNodo= new nodoListaMovil(pMov);
        nuevoNodo.setSig(inicio);
        inicio=nuevoNodo;
    }
    public nodoListaMovil buscarMovil(String Matricula)
    {
        boolean pertenece = false;
        nodoListaMovil auxMovil=null;
        nodoListaMovil aux= inicio;
        
        while(aux.getSig()!=null && !pertenece )
        {
            if (aux.getMovil().getMatricula().equals(Matricula))
            {
                pertenece=true;
                auxMovil=aux;
            }
            aux=aux.getSig();
        }
        if (aux.getMovil().getMatricula().equals(Matricula))
        {
            pertenece=true;
            auxMovil=aux;
        }
        return auxMovil;
    }
    public void listarMovil()
    {
        nodoListaMovil aux=getInicio();
        
        while(aux.getSig() != null)
        {
            System.out.println(aux.getMovil().getMatricula());
            aux=aux.getSig();
        }
        System.out.println(aux.getMovil().getMatricula());
    }
    public void eliminarMovil(Movil pMov)
    {
        nodoListaMovil aux= inicio, ant=inicio;
        nodoListaMovil pEliminar = buscarMovil(pMov.getMatricula());
        
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
