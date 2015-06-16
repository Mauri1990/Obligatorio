/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio.Tramo;

import obligatorio.Ruta.Ruta;

/**
 *
 * @author Mauricio
 */
public class Tramo 
{

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public String getEstadoTramo() {
        return estadoTramo;
    }

    public void setEstadoTramo(String estadoTramo) {
        this.estadoTramo = estadoTramo;
    }
   
    
    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    private String CiudadOrigen;
    private String CiudadDestino;
    private int Distancia;
    private String estadoTramo;
    private Ruta ruta;
}
