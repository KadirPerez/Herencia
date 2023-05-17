package herencia;

import java.util.ArrayList;

public class Television extends DispositivoElectronicoDeConsumo
{
    private final Pantalla pantalla;
    
    public Television(String fab, String numSerie, String marca, String nombre, float costo, ArrayList comp, String fabP, String numSerieP, String marcaP, String nombreP, int x, int y, float costoP){
        super(fab, numSerie, marca, nombre, costo, comp);
        pantalla = new Pantalla(fabP, numSerieP, marcaP, nombreP, costoP, new ArrayList(), x, y);
        agregarComponente(pantalla);
    }
    
    public Television(String fab, String numSerie, String marca, String nombre, 
            String fabP, String numSerieP, String marcaP, String nombreP, int x, int y){
        super(fab, numSerie, marca, nombre);
        pantalla = new Pantalla(fabP, numSerieP, marcaP, nombreP, x, y);
        agregarComponente(pantalla);
    }
    
    public Pantalla getPantalla(){
        return pantalla;
    }
    
    @Override
    public String toString(){
        return "Television\n\n  Fabricante: " + getFabricante() + 
               "\n  Numero de serie: " + getNumeroSerie() + 
               "\n  Marca: " + getMarca() +  
               "\n  Nombre: " + getNombre() +  
               "\n  Costo: " + getCosto() + 
               "\n  Encendido: " + isEncendido() +
               "\n  Componentes: " + getComponentes() ;
    }
}
