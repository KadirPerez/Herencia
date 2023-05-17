package herencia;

import java.util.ArrayList;

public class DispositivoElectronico
{
    private final String fabricante;
    private final String numeroSerie;
    private final String marca;
    private final String nombre;
    private float costo; 
    private ArrayList componentes;
    
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre){
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = 0;
        componentes = new ArrayList<ComponenteElectronico>();
    }
   
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo,  ArrayList componentes){
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = componentes;
    }
    
    public float getCosto(){
        return costo;
    }
    
    public ArrayList getComponentes(){
     return componentes;
    }
        
    public String getFabricante(){
        return fabricante;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarComponente(ComponenteElectronico componente){
       componentes.add(componente);
    }
    
    public void quitarComponente(ComponenteElectronico componente){
        componentes.remove(componente);
    }
    
    public void setComponentes(ArrayList componentes){
        this.componentes = componentes;
    }
    
    public void setCosto(int costo){
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "Dispositivo electronico\n\n  Fabricante: " + fabricante + 
               "\n  Numero de serie: " + numeroSerie + 
               "\n  Marca: " + marca +  
               "\n  Nombre: " + nombre +  
               "\n  Costo: " + costo + 
               "\n  Componentes: " + componentes ;
    }
}
