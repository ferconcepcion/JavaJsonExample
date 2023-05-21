package com.mycompany.jsonexample;

import org.json.JSONArray;
import org.json.JSONObject;

public class Persona {
    private String nombre;
    private int edad;
    private Persona esposa;
    private Persona[] hijos;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.esposa = null;
        this.hijos = null;
    }
    
    public void AsignarEsposa(Persona esposa){
        this.esposa = esposa;
    }
    
    public void AsignarHijos(Persona[] hijos){
        this.hijos = hijos;
    }
    
    public JSONObject ToJson(){
        // Persona principal:
        
        JSONObject objetoJSON = new JSONObject();
        objetoJSON.put("nombre", this.nombre);
        objetoJSON.put("edad", this.edad);
        
        // esposa:
        JSONObject esposaJSON  = new JSONObject();
        if (this.esposa != null)
        {
            esposaJSON = this.esposa.ToJson();
        }
        
        // hijos
        JSONArray hijosJSON = new JSONArray();
        
        if (this.hijos != null){
            for (int i = 0; i < this.hijos.length; i++){
                hijosJSON.put(this.hijos[i].ToJson());
            }
        }
        
        // esposa e hijos en padre:
        objetoJSON.put("esposa", esposaJSON);
        objetoJSON.put("hijos", hijosJSON);

        return objetoJSON;
    }
}
