package herencia;

import java.util.ArrayList;

public class Smartphone extends Computadora
{
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;
    
    
    public Smartphone(String fab, String numSerie, String marca, String nombre, int costo, ArrayList comp, 
            String fabMP, String numSerieMP, String marcaMP, String nombreMP, int cacheMP, long vel, long ramMB,
            String numSerieS, String nombreS, String unidad, int valor, String numSerieP, String nombreP, int x, int y, float costoMP, float costoP, float costoS){
        
        super(fab, numSerie, marca, nombre, costo, comp, fabMP, numSerieMP, marcaMP, nombreMP, cacheMP, vel, ramMB, costoMP);
        sensorDeHuella = new Sensor(fab, numSerieS, marca, nombreS, costoS, new ArrayList() ,"Huellas", unidad ,valor);
        pantalla = new Pantalla(fab, numSerieP, marca, nombreP,costoP, new ArrayList(), x, y );
        agregarComponente(sensorDeHuella);
        agregarComponente(pantalla);
    }
    
    public Smartphone(String fab, String numSerie, String marca, String nombre, int costo, ArrayList comp, 
            String numSerieS, String nombreS, String unidad, int valor, String numSerieP, String nombreP, int x, int y){
        super(fab, numSerie, marca, nombre, costo, comp);
        sensorDeHuella = new Sensor(fab, numSerieS, marca, nombreS, "Huellas", unidad ,valor);
        pantalla = new Pantalla(fab, numSerieP, marca, nombreP, x, y );
        agregarComponente(sensorDeHuella);
        agregarComponente(pantalla);
    }
    
    public Smartphone(String fab, String numSerie, String marca, String nombre,
            String fabMP, String numSerieMP, String marcaMP, String nombreMP, int cacheMP, long vel, long ramMB, 
            String numSerieS, String nombreS, String unidad, int valor, String numSerieP, String nombreP, int x, int y){
        super(fab, numSerie, marca, nombre, fabMP, numSerieMP, marcaMP, nombreMP, cacheMP, vel, ramMB);
        sensorDeHuella = new Sensor(fab, numSerieS, marca, nombreS, "Huellas", unidad ,valor);
        pantalla = new Pantalla(fab, numSerieP, marca, nombreP, x, y );
        agregarComponente(sensorDeHuella);
        agregarComponente(pantalla);
    }
    
    public Smartphone(String fab, String numSerie, String marca, String nombre, 
            String numSerieS, String nombreS, String unidad, int valor, String numSerieP, String nombreP, int x, int y){
        super(fab, numSerie, marca, nombre);
        sensorDeHuella = new Sensor(fab, numSerieS, marca, nombreS, "Huellas", unidad ,valor);
        pantalla = new Pantalla(fab, numSerieP, marca, nombreP, x, y );
        agregarComponente(sensorDeHuella);
        agregarComponente(pantalla);
    }
    
    
    public Sensor getSensor(){
        return sensorDeHuella;
    }
    
    public Pantalla getPantalla(){
        return pantalla;
    }
    
    @Override
    public String toString(){
        return "Smartphone\n\n  Fabricante: " + getFabricante() + 
               "\n  Numero de serie: " + getNumeroSerie() + 
               "\n  Marca: " + getMarca() +  
               "\n  Nombre: " + getNombre() +  
               "\n  Costo: " + getCosto() + 
               "\n  Encendido: " + isEncendido() +
               "\n  Ram: " + getRam() +
               "\n  Componentes: " + getComponentes() ;
    }
}
