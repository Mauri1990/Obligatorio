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
public class listaRuta 
{

    public nodoListaRuta getInicio() {
        return inicio;
    }

    public void setInicio(nodoListaRuta inicio) {
        this.inicio = inicio;
    }
    
     private nodoListaRuta inicio;
     
     public void agregarAlfinal(Ruta pRut)
     {
         nodoListaRuta nuevoNodo= new nodoListaRuta(pRut);
         nodoListaRuta aux=getInicio();
         
         while(aux.getSig()!=null)
         {
             aux=aux.getSig();
         }
         aux.setSig(nuevoNodo);
     }
     public void agregarAlprincipio(Ruta pRut)
     {
         nodoListaRuta nuevoNodo = new nodoListaRuta(pRut);
         nuevoNodo.setSig(inicio);
         inicio=nuevoNodo;
     }
     public nodoListaRuta buscarRuta(int numero)
     {
         boolean pertenece=false;
         nodoListaRuta auxRuta= null;
         nodoListaRuta aux= inicio;
         
         while(aux.getSig()!=null && !pertenece)
         {
             if (aux.getDato().getNumero()==numero)
             {
                 pertenece=true;
                 auxRuta=aux;
             }
             aux=aux.getSig();
         }
         if (aux.getDato().getNumero()==numero)
         {
             pertenece=true;
             auxRuta=aux;
         }
         return auxRuta;
     }
     public void listarNodo()
     {
         nodoListaRuta aux= getInicio();
         
         while(aux.getSig()!=null)
         {
             System.out.println(aux.getDato().getNumero());
             aux= aux.getSig();
         }
         System.out.println(aux.getDato().getNumero());
     }
     public void eliminar(Ruta pRut)
     {
         nodoListaRuta aux= inicio, ant=inicio;
         nodoListaRuta pEliminar = buscarRuta(pRut.getNumero());
         
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
