package herencia;

import java.util.ArrayList;

public class Computadora extends DispositivoElectronicoDeConsumo
{
    private long ramMB;
    private Microprocesador cpu;
    
    public Computadora(String fab, String numSerie, String marca, String nombre, int costo, ArrayList comp, String fabMP,
            String numSerieMP, String marcaMP, String nombreMP, int cacheMP, long vel, long ramMB, float costoMP){
        super(fab, numSerie, marca, nombre, costo, comp);
        cpu = new Microprocesador(fabMP, numSerieMP, marcaMP, nombreMP,costoMP, new ArrayList(),cacheMP, vel);
        agregarComponente(cpu);
        this.ramMB = ramMB;
    }
    
    public Computadora(String fab, String numSerie, String marca, String nombre, float costo, ArrayList comp){
        super(fab, numSerie, marca, nombre, costo, comp);
        cpu = new Microprocesador("", "", "", "", 0, 0);
        agregarComponente(cpu);
    }
    
    public Computadora(String fab, String numSerie, String marca, String nombre, String fabMP, String numSerieMP, String marcaMP, String nombreMP, int cacheMP, long vel, long ramMB){
        super(fab, numSerie, marca, nombre);
        cpu = new Microprocesador(fabMP, numSerieMP, marcaMP, nombreMP, cacheMP, vel);
        agregarComponente(cpu);
        this.ramMB = ramMB;
    }
    
    public Computadora(String fab, String numSerie, String marca, String nombre){
        super(fab, numSerie, marca, nombre);
        cpu = new Microprocesador("", "", "", "", 0, 0);
        agregarComponente(cpu);
    }
    
    
    public Microprocesador getCpu(){
        return cpu;
    }
    
    public long getRam(){
        return ramMB;
    }
    
    public void setMicroprocesador(Microprocesador cpu){
        this.cpu = cpu;
        getComponentes().set(0,cpu);
    }
    
    public void setRam(long ram){
        ramMB = ram;
    }
    
    public String toString(){
        return "Computadora\n\n  Fabricante: " + getFabricante() + 
               "\n  Numero de serie: " + getNumeroSerie() + 
               "\n  Marca: " + getMarca() +  
               "\n  Nombre: " + getNombre() +  
               "\n  Costo: " + getCosto() + 
               "\n  Encendido: " + isEncendido() +
               "\n  Ram: " + ramMB +
               "\n  Componentes: " + getComponentes() ;
    }
}
