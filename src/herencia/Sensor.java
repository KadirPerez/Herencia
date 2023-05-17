package herencia;

import java.util.ArrayList;


public class Sensor extends ComponenteElectronico
{
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;
    
    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, String tipo, String unidad, int valor){
        super(fabricante, numeroSerie, marca, nombre);
        this.valor = valor;
        this.tipo = tipo;
        unidadDeMedida = unidad;
    }
    
    public Sensor(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes, String tipo, String unidad, int valor){
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.valor = valor;
        this.tipo = tipo;
        unidadDeMedida = unidad;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }
    
    public int getValor(){
        return valor;
    }
    
    public String toString(){
        return "\n\n    Sensor\n\n      Fabricante: " + getFabricante()+ 
               "\n      Numero de serie: " + getNumeroSerie() + 
               "\n      Marca: " + getMarca() +  
               "\n      Nombre: " + getNombre() +  
               "\n      Costo: " + getCosto() + 
               "\n      Tipo: " + tipo +  
               "\n      Unidad de medida: " + unidadDeMedida +
               "\n      Valor: " + valor +
               "\n      Componentes: " + getComponentes(); 
    }
}
