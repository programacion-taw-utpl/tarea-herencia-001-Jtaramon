/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import laempresa.*;
import personal.*;

/**
 *
 * @author Juan Ramón
 */
public class Principal {
    public static void main(String[] args) {
        
        //ARREGLO
        Trabajador t[] = new Trabajador[5]; 
        
        //OBJETOS
        t[0] = new Trabajador("Ana Luisa","Velez Alcivar",30,12903939,100,40,10);
        t[1] = new Trabajador("Mario Anibal","Vela Narvaez",35,212889,100,50,10);
        
        
        
        EmpresaPrivada emp = new EmpresaPrivada ("Soluciones Software","SS's", "Loja",t,200000,12);
        
        
        System.out.println(emp);
    }
    
}
