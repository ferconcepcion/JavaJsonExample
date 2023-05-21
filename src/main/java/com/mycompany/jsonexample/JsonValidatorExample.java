package com.mycompany.jsonexample;

public class JsonValidatorExample {
    
    public static void main(String[] args) {
        
        String jsonValido = "{\"name\":\"John\", \"age\":25, \"email\":\"john@example.com\"}";
        String jsonInvalido = "{\"name\":\"John\", \"age\":25, email\":\"john@example.com\"}";

        JsonValidator validador1 = new JsonValidator(jsonValido);
        JsonValidator validador2 = new JsonValidator(jsonInvalido);

        if (validador1.ValidateJson()){
            System.out.println("Válido: "+ jsonValido);
        }
        else{
            System.out.println("Inválido: "+ jsonValido);
        }

        if (validador2.ValidateJson()){
            System.out.println("Válido: "+ jsonInvalido);
        }
        else{
            System.out.println("Inválido: "+ jsonInvalido);
        }

    }
}
