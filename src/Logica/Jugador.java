/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Adrian
 */
public class Jugador {
    private int numCamiseta, golesAnotados;
    private String nombre, posicion;

    public Jugador(int numCamiseta, String nombre, String posicion) {
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        this.posicion = posicion;
        golesAnotados=0;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public void addGoles(int goles){
        golesAnotados+=goles;
    }
}
