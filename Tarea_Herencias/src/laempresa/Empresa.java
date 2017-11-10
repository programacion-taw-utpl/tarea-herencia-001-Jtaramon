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
    protected Trabajador[] arr = new Trabajador[2];
    
    public Empresa(String n, String s, String cl,Trabajador arrtra,Trabajador arrtra2){
        setNombre(n);
        setSiglas(s);
        setCiudad(cl);
        arr[0]=arrtra;
        arr[1]=arrtra2;
        
        
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

    public void setArr(Trabajador[] arr) {
        this.arr [0]= arr[0];
    }
    public void setArr2(Trabajador[] arr) {
        this.arr[1] = arr[1];
    }

    public Trabajador getArr1() {
        return arr[0];
    }
    public Trabajador getArr2() {
        return arr[1];
    }

    
    @Override
    public String toString() {
        String cadena = String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\n",getNombre(),getSiglas(),getCiudad());
        return cadena;
    }
    
    
    
}
