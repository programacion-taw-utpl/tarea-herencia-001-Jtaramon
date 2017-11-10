/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;
import Principal.Principal;


/**
 *
 * @author Juan Ramón
 */
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected int cedula;
    
    public Persona(String n, String ap, int ed, int ced){
        setNombres(n);
        setApellidos(ap);
        setEdad(ed);
        setCedula(ced);
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t*.%s %s\n\t%d años de edad\n\tCI: %d\n",
                getNombres(),getApellidos(),getEdad(),getCedula() );
        return cadena;
    }
    
    
    
}
