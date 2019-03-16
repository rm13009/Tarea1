/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_procesamiento;

/**
 *
 * @author Equipo
 */
public class Procesamiento {
    
    //se encargará de realizar una suma de potencias de 10 números,
    //siendo el número entero el exponente y el número decimal será 
    //la base inicial. Los resultados serán expresados con redondeo.
    
    double respuesta( double exp, int base){
    
    int veces;
    double numeroPotencia;
    
    numeroPotencia= 1;
    veces = 0;
  
        while (veces< exp){
        numeroPotencia = numeroPotencia * base;
        veces++;
        }    
    
        return numeroPotencia;  
    }

}
