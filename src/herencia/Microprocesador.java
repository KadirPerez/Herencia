package herencia;

import java.util.ArrayList;


public class Microprocesador extends ComponenteElectronico
{
    private final int cacheRAM;
    private final long velocidadHz;
    
    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, int cache, long velocidad){
        super(fabricante, numeroSerie, marca, nombre);
        cacheRAM = cache;
        velocidadHz = velocidad;
    }
    
    public Microprocesador(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes, int cache, long velocidad){
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        cacheRAM = cache;
        velocidadHz = velocidad;
    }
    
    public int getCache(){
        return cacheRAM;
    }
    
    public long getVelocidad(){
        return velocidadHz;
    }
    
    public String toString(){
        return "\n\n    Microprocesador\n\n      Fabricante: " + getFabricante()+ 
               "\n      Numero de serie: " + getNumeroSerie() + 
               "\n      Marca: " + getMarca() +  
               "\n      Nombre: " + getNombre() +  
               "\n      Costo: " + getCosto() + 
               "\n      Cache: " + cacheRAM +  
               "\n      Velocidad: " + velocidadHz +
               "\n      Componentes: " + getComponentes(); 
    }
}
