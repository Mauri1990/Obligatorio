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
public class listaAsignarMovilATramo 
{
     private nodoListaAsignarMovilATramo inicio;

    public nodoListaAsignarMovilATramo getInicio() {
        return inicio;
    }

    public void setInicio(nodoListaAsignarMovilATramo inicio) {
        this.inicio = inicio;
    }
     public void agregarAlfinal(AsignarMovilTramo pAmov)
     {
         nodoListaAsignarMovilATramo nuevoNodo= new nodoListaAsignarMovilATramo(pAmov);
         nodoListaAsignarMovilATramo aux=getInicio();
         
         while(aux.getSig()!=null)
         {
             aux=aux.getSig();
         }
         aux.setSig(nuevoNodo);
     }
     public void agregarAlprincipio(AsignarMovilTramo pAmov)
     {
         nodoListaAsignarMovilATramo nuevoNodo= new nodoListaAsignarMovilATramo(pAmov);
         nuevoNodo.setSig(inicio);
         inicio=nuevoNodo;
     }
     public nodoListaAsignarMovilATramo buscarAsignacion(String matricula, String CiuOr, String CiudDes)
     {
         boolean pertenece=false;
         nodoListaAsignarMovilATramo auxAsig=null;
         nodoListaAsignarMovilATramo aux=inicio;
         
         while(aux.getSig()!=null && !pertenece)
         {
             if (aux.getAsignarMovilTramo().getMatricula().equals(matricula) && aux.getAsignarMovilTramo().getCiudadOrigen().equals(CiuOr) && aux.getAsignarMovilTramo().getCiudadDestino().equals(CiudDes))
             {
                 pertenece=true;
                 auxAsig=aux;
             }
             aux=aux.getSig();
         }
         if (aux.getAsignarMovilTramo().getMatricula().equals(matricula) && aux.getAsignarMovilTramo().getCiudadOrigen().equals(CiuOr) && aux.getAsignarMovilTramo().getCiudadDestino().equals(CiudDes))
         {
             pertenece=true;
             auxAsig=aux;
         }
         return auxAsig;
     }
     public void listarAsignaciones()
     {
         nodoListaAsignarMovilATramo aux= getInicio();
         
         while(aux.getSig()!=null)
         {
             System.out.println(aux.getAsignarMovilTramo().getMatricula() +aux.getAsignarMovilTramo().getCiudadOrigen() +aux.getAsignarMovilTramo().getCiudadDestino());
             aux=aux.getSig();
         }
         System.out.println(aux.getAsignarMovilTramo().getMatricula() +aux.getAsignarMovilTramo().getCiudadOrigen() +aux.getAsignarMovilTramo().getCiudadDestino());
     }
     public void eliminarAsignacion(AsignarMovilTramo pAsi)
     {
         nodoListaAsignarMovilATramo aux=inicio, ant=inicio;
         nodoListaAsignarMovilATramo pEliminar =buscarAsignacion(pAsi.getMatricula(),pAsi.getCiudadOrigen(),pAsi.getCiudadDestino());
         
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
