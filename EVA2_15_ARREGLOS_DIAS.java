/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_arreglos_dias;

/**
 *
 * @author gerar
 */
public class EVA2_15_ARREGLOS_DIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] diasSemana= new String [7];
     int[] arreglo = new int[100];
       
     diasSemana[0]="Domingo";
     diasSemana[1]="Lunes";
     diasSemana[2]="Martes";
     diasSemana[3]="Miercoles";
     diasSemana[4]="Jueves";
     diasSemana[5]="Viernes";
     diasSemana[6]="Sabado";
     for(int i=0; i < diasSemana.length; i++){
         System.out.println(diasSemana[i]); 
     }
    }
    
}
