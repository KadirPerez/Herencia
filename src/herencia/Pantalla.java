package herencia;

import java.util.ArrayList;


public class Pantalla extends ComponenteElectronico
{
    private final int resolucionX ;
    private final int resolucionY;
    
    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, int rx, int ry){
        super(fabricante, numeroSerie, marca, nombre);
        resolucionX = rx;
        resolucionY = ry;
    }
    
    public Pantalla(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes, int rx, int ry){
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        resolucionX = rx;
        resolucionY = ry;
    }
    
    public int getResolucionx(){
        return resolucionX;
    }
    
    public long getResolucionY(){
        return resolucionY;
    }
    
    public String toString(){
        return "\n\n    Pantalla\n\n      Fabricante: " + getFabricante()+ 
               "\n      Numero de serie: " + getNumeroSerie() + 
               "\n      Marca: " + getMarca() +  
               "\n      Nombre: " + getNombre() +  
               "\n      Costo: " + getCosto() + 
               "\n      Resolucion en x: " + resolucionX +  
               "\n      Resolucion en y: " + resolucionY +
               "\n      Componentes: " + getComponentes(); 
    }
}
