package com.mycompany.jsonexample;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample {

    public static void main(String[] args) {
        
        // Persona principal:
        
        JSONObject objetoJSON = new JSONObject();
        objetoJSON.put("nombre", "Juan");
        objetoJSON.put("edad", 30);
        
        System.out.println(objetoJSON.toString());
        
        // esposa:
        JSONObject esposaJSON = new JSONObject();
        esposaJSON.put("nombre", "Ana");
        esposaJSON.put("edad", 28);
        esposaJSON.put("sexo", "femenino");
        
        System.out.println(esposaJSON.toString());
        
        // hijos
        JSONArray hijosJSON = new JSONArray();
        
        // hijo1:
        JSONObject hijo1JSON = new JSONObject();
        hijo1JSON.put("nombre", "Pedro");
        hijo1JSON.put("edad", 5);
        hijo1JSON.put("sexo", "masculino");
        
        // hijo2:
        JSONObject hijo2JSON = new JSONObject();
        hijo2JSON.put("nombre", "María");
        hijo2JSON.put("edad", 3);
        hijo2JSON.put("sexo", "femenino");
        
        // hijo1 y 2 en hijos:
        hijosJSON.put(hijo1JSON);
        hijosJSON.put(hijo2JSON);
        
        // esposa e hijos en padre:
        objetoJSON.put("esposa", esposaJSON);
        objetoJSON.put("hijos", hijosJSON);

        System.out.println(objetoJSON.toString());
    }
}
