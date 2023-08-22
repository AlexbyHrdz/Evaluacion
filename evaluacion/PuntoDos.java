/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

/**
 *
 * @author 503
 */
public class PuntoDos {
    public static void main(String[]args){
        System.out.println("Edad e mis familiares: ");
        int [][] edades ={{17,16,15},{48,47,27},{68,70,89}};
         for(int i=0; i<edades.length; i++){
   for(int j=0; j<edades[i].length; j++){
       System.out.print(edades[i][j]+ "\t");
   }
       System.out.println();
   }
    }
}
