/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

/**
 *
 * @author 503
 */
public class PuntoTresCuatroCinco {
    public static void main(String[]args){
     
        String [][] jugadores = {{"Juan    ","Pedro   ","Luis"},{"15        ","16        ","17"},{"Delantero   ","Defensa  ","Portero"}};
    
     for(int i=0; i<jugadores.length; i++){
   for(int j=0; j<jugadores[i].length; j++){
       System.out.print(jugadores[i][j]+ "\t");
       
   }
       System.out.println();
   }
     System.out.println("Indique la posicion de arquero: " + jugadores[2][2]);
        System.out.println("Indique la posicion de “16 años: " + jugadores[1][1]);
    }
    
        
        
    }


