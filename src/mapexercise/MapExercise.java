/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexercise;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author root
 */
public class MapExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //The Firest Map Object
      Map<String, String> presidentPays = new HashMap<String, String>();
        //add key-value pair to hashmap
        presidentPays.put("Thisekedi", "Congo DRC");
        presidentPays.put("Kagame", "Rwanda");
        presidentPays.put("Magufuli","Tanzanie");
        presidentPays.put("Museveni","Ouganda");
        presidentPays.put("Kenyata","Kenya");
        
       // The Seconde Map Object
        Map<String, String> paysCapital = new HashMap<String, String>();
        paysCapital.put("Congo DRC", "Kinshasa");
        paysCapital.put("Rwanda", "Kigali");
        paysCapital.put("Tanzanie", "Dar-es-salam");
        paysCapital.put("Ouganda", "Kampala");
        paysCapital.put("Kenya", "Nairobi");
       
        //Copy Of The First Map In The Second
        presidentPays.putAll(paysCapital);
        System.out.println(presidentPays);
        
    }
    
}
