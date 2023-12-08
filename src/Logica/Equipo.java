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
public class Restaurant {
    private final Chef chef[] = new Cehf  [23];
    
  
    
    public Chef searchcheff(int namechef){
        return chef [namechef-1];
    }
    
    public boolean addChef(int namechef, String nombre, String posicion){
        if(namechef<=23 && namechef>=1){
            if(chef[namechef-1] == null){
                chef[namechef-1] = new chef (namechef, nombre, posicion);
                return true;
            }
        }
        return false;
    }
    
    public boolean addGoles(int numCamisa, int goles){
        if(chef[numCamisa-1] != null){
            chef[numCamisa-1].addGoles(goles);
            return true;
        }
        return false;
    }
    
    public String[] getTitles(){
        return new String[] {"Num. Camisa", "Nombre", "Posicion", "Goles Anotados"};
    }
    
    public Object[][] getChef(){
        Object[][] players = new Object[chef.length][4];
        for (int i = 0; i < this.chef.length; i++) {
            if(chef[i]!=null){
                players[i][0] = chef[i].getNumCamiseta();
                players[i][1] = chef[i].getNombre();
                players[i][2] = chef[i].getPosicion();
                players[i][3] = chef[i].getGolesAnotados();
            }
        }
        return players;
    }
}
