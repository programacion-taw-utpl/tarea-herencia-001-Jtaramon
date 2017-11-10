/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import personal.Trabajador;
import Principal.Principal;

/**
 *
 * @author Juan Ramón
 */
public class EmpresaPrivada extends Empresa{
    private double ventas_mensal_fijo; 
    private int numero_sucursales;
    
    public EmpresaPrivada(String n, String si, String ciudad,Trabajador arr,Trabajador arr2,double ventas,int sucu){
        super(n,si,ciudad,arr,arr2);
        setVentas_mensal_fijo(ventas);
        setNumero_sucursales(sucu);
        
    }
    

    public void setVentas_mensal_fijo(double ventas_mensal_fijo) {
        this.ventas_mensal_fijo = ventas_mensal_fijo;
    }

    public double getVentas_mensal_fijo() {
        return ventas_mensal_fijo;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }
    
    public int getNumero_sucursales() {
        return numero_sucursales;
    
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("%sVentas: %.1f\nSucursales: %d\nLista Trabajadores:\n\n%s\n%s",super.toString(),
                getVentas_mensal_fijo(),getNumero_sucursales(),super.getArr1(),super.getArr2() );
        return cadena;
    }
    
    
    
    
    
    
}
