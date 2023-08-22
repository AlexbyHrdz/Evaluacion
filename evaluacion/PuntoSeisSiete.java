/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class PuntoSeisSiete {
    static Scanner sc=new Scanner (System.in);
     public static void main(String[]args){
    int opc=0;
        do{
            System.out.println(+ datos());
            opc++;
      
    
         }while (opc == 7);
        
        
    }
    public static int datos(){

             System.out.println("Ingrese Los numeros que va a utilizar en esta lista ");
        String num[]= new String[7];
    num[0]= sc.nextLine() ;
   num[1]= sc.nextLine();
    num[2]= sc.nextLine();
    num[3]= sc.nextLine();
    num[4]= sc.nextLine();
    num[5]= sc.nextLine();
    num[6]= sc.nextLine();
        for(int i=0; i<num.length; i++){
            System.out.println("Su lista de numeros es: " +num[i]+ "y el numnero de elementos es: " +i);
            
        }
        
     
           return 0;
        
    }
}
   
    

