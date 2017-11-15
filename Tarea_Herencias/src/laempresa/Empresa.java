/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import personal.*;
import Principal.Principal;


/**
 *
 * @author Juan Ramón
 */
public class Empresa {
    protected String nombre;
    protected String siglas;
    protected String ciudad;
    protected Trabajador[] array ;
    
    public Empresa(String n, String s, String cl, Trabajador[]arr){
        setNombre(n);
        setSiglas(s);
        setCiudad(cl);
        setArray(arr);
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setArray(Trabajador[] arr) {
        array = arr;
    }

    

    public Trabajador[] getArray() {
        return array;
    }
   

   

    
    @Override
    public String toString() {
        String cadena = String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\n",getNombre(),getSiglas(),getCiudad());
        return cadena;
    }
    
    
    
}
