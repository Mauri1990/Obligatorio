
package Obligatorio;


import obligatorio.Cuidad.Ciudad;

public class Sistema {
    
   public static Ciudad[]  ciudades = new Ciudad[20];
   private static int topeCiudades = 0;

    public static int getTopeCiudades() {
        return topeCiudades;
    }

    public static void setTopeCiudades(int topeCiudades) {
        Sistema.topeCiudades = topeCiudades;
    }
   
   public enum TipoRet{OK, ERROR_1, ERROR_2 , ERROR_3,               
      ERROR_4, ERROR_5, NO_IMPLEMENTADA};

   public enum EstadoTramo {BUENO, REGULAR, DEFICIENTE,    
      EN_REPARACION };

       
   public TipoRet crearSistema(int N) {
      
      ciudades= new Ciudad[N];
      return TipoRet.NO_IMPLEMENTADA;
   }
    
   public TipoRet destruirSistema( ) {
       
       ciudades = null;
      return TipoRet.NO_IMPLEMENTADA;
   }
   private static boolean estaCiudad(String nombre){
        boolean esta = false;
        int i=0;
        while(!esta && i< Sistema.topeCiudades){
            if(ciudades[i].getNombre().equals(nombre)){
                esta = true;
            }
            i++;
        }
       return esta;
   }
   private static Ciudad buscarCiudad(String nombre)
   {
       Ciudad aux= new Ciudad();
       boolean esta = false;
       int i = 0;
       while(!esta && i<Sistema.topeCiudades )
       {
           if (ciudades[i].getNombre().equals(nombre)) 
           {
               aux=ciudades[i];
           }
           i++;
       }
       return aux;
   }
   public static void registrarCiudad(String nombre, int poblacion) {
       Ciudad aux = new Ciudad(nombre,poblacion);
       if (!estaCiudad(nombre) && Sistema.topeCiudades<=20)
       {
           ciudades[Sistema.topeCiudades]=aux;
           Sistema.topeCiudades++;
       }
   }
    
    public static void eliminarCiudad(String nombre)
   {
       int i=0;
        while(i<=Sistema.topeCiudades && ciudades[i].getNombre().equals(nombre))
         {
             ciudades[i]=null;
             i++;
         }
       
   }
   
   public TipoRet agregarRuta(int numero, String nombre) {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet agregarTramo(String ciudadOrigen, String ciudadDestino, int distancia, EstadoTramo estado, int ruta) {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet listarCiudades() {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet registrarMovil(String matricula, String modeloCoche) {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet asignarMovilATramo(String matricula, String ciudadOrigen, String ciudadDestino, int kmts) {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet informeMoviles() {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   public TipoRet mostarDistancias() {
      return TipoRet.NO_IMPLEMENTADA;
   }
   
   
}

