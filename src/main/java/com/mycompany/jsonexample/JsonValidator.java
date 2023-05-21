package com.mycompany.jsonexample;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonValidator {
    private String json;
            
    public JsonValidator(String json){
        this.json = json;
    }
    
    public boolean ValidateJson(){
        try {
            JSONObject jsonObject = new JSONObject(json);
            if (jsonObject.isEmpty()){
                return false;
            }
            return true;
        } catch (JSONException ex) {
            return false;
        }
    }
}
