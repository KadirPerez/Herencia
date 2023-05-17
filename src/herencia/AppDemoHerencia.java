package herencia;

import java.util.ArrayList;

public class AppDemoHerencia
{
  public static void main(String arrgs[]){
    ArrayList<Smartphone> listaDeSmartphones = new ArrayList(); 
    ArrayList<Television> listaDeTVs = new ArrayList(); 
    
    listaDeSmartphones. add(new Smartphone("Samsung", "3912", "Samsung", "Galaxy s23", 20000, new ArrayList(), 
            "Qualcomm Technologies", "8245", "Snapdragon", "Snapdragon 8", 123, 456, 8,
            "5280", "Sensor Samsung", "pascal", 1000 , "7100", "Panel Dynamic AMOLED 2X", 1080  , 2340, 5000, 3000, 2000));
    
    listaDeSmartphones. add(new Smartphone("Apple", "8121", "Apple", "Iphone 14", 25000, new ArrayList(), 
            "Apple", "0189", "Apple", "Apple A15 Bionic 8", 143, 236, 8,
            "4502", "Sensor apple", "pascal", 1050 , "46602", "Super Retina XDR", 1170, 2532, 6000, 5000, 5000));
    
    listaDeTVs.add(new Television("LG", "3912", "LG", "LG Oled ThinQ" , 15000, new ArrayList(), "LG", "3691", "LG", "Oled evo",  7680, 4320, 10000));
    listaDeTVs.add(new Television("Samsung", "7896", "Samsung" , "Samsung led smart TV" , 15000, new ArrayList(),"LG", "8245", "Samsung", "Oled",  7680, 4320, 13000));
    
    for(int i = 0; i < 2 ; i++){
        System.out.println(listaDeSmartphones.get(i) + "\n\n");
    }
    
    for(int i = 0; i < 2 ; i++){
        System.out.println(listaDeTVs.get(i) + "\n\n");
    }
    
  }

}
