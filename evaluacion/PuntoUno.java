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
public class PuntoUno {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[]args){
        System.out.println("Ingrese 6 nombres de sus compañeros");
        String nom[]= new String[6];
    nom[0]= sc.nextLine() ;
    nom[1]= sc.nextLine();
    nom[2]= sc.nextLine();
    nom[3]= sc.nextLine();
    nom[4]= sc.nextLine();
    nom[5]= sc.nextLine();
        for(int i=0; i<nom.length; i++){
            System.out.println("Posicion en la lista de estudiantes es: " + i + " y su nombre es: " +nom[i] );
        }
    }
}
