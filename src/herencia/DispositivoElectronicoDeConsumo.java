package herencia;

import java.util.ArrayList;

public class DispositivoElectronicoDeConsumo extends DispositivoElectronico
{
    private boolean encendido;
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes){
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        encendido = false;
    }
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes, boolean encendido){
        super(fabricante, numeroSerie, marca, nombre,costo, componentes);
        this.encendido = encendido;
    }
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre){
        super(fabricante, numeroSerie, marca, nombre);
        encendido = false;
    }
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, boolean encendido){
        super(fabricante, numeroSerie, marca, nombre);
        this.encendido = encendido;
    }
       
    public void apagar(){
        encendido = false;
    }
    
    public void encender(){
        encendido = true;
    }
    
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }
    
    public boolean isEncendido(){
        return encendido;
    }
    
    @Override
    public String toString(){
        return "Dispositivo electronico de consumo\n\n  Fabricante: " + getFabricante() + 
               "\n  Numero de serie: " + getNumeroSerie() + 
               "\n  Marca: " + getMarca() +  
               "\n  Nombre: " + getNombre() +  
               "\n  Costo: " + getCosto() + 
               "\n  Encendido: " + encendido + 
               "\n  Componentes: " + getComponentes();
    }
}
