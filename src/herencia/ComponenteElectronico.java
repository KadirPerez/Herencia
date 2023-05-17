package herencia;

import java.util.ArrayList;

public class ComponenteElectronico extends DispositivoElectronico
{
    
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre){
        super(fabricante, numeroSerie, marca, nombre);
    }
    
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes){
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
    }
    
    @Override
    public String toString(){
        return "\n\n    Componente electronico\n\n      Fabricante: " + getFabricante()+ 
               "\n      Numero de serie: " + getNumeroSerie() + 
               "\n      Marca: " + getMarca() +  
               "\n      Nombre: " + getNombre() +  
               "\n      Costo: " + getCosto() + 
               "\n      Componentes: " + getComponentes(); 
    }
}
