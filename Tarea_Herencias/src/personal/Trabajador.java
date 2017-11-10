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
public class Trabajador extends Persona{
    private double costo_seguro; 
    private int horas_trabajadas; 
    private double costo_por_hora;
    
    public Trabajador (String n,String a,int e,int ced,
            double cops,int horas,double cph){
        super(n,a,e,ced);
        setCosto_seguro(cops);
        setHoras_trabajadas(horas);
        setCosto_por_hora(cph);
    }
    
    

    public void setCosto_seguro(double costo_seguro) {
        this.costo_seguro = costo_seguro;
    }

    public double getCosto_seguro() {
        return costo_seguro;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setCosto_por_hora(double costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }

    public double getCosto_por_hora() {
        return costo_por_hora;
    }
    
    public double Obtener_sueldo (){
        double sueldo;
        sueldo =((horas_trabajadas*costo_por_hora)+costo_seguro);
        return sueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\tSeguro: %.1f\n\tHoras Trabajadas: %d\n\t"
                + "Valor por Hora: %.1f\n\tSueldo: %.1f",super.toString(),getCosto_seguro(),getHoras_trabajadas(),
                getCosto_por_hora(),Obtener_sueldo());
        return cadena;
    }
    
    
    
    
    
}
