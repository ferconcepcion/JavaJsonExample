package com.mycompany.jsonexample;

public class JsonExampleConObjeto {
    
        public static void main(String[] args) {
        
        // Persona principal:
        Persona p = new Persona("Juan", 30);
        
        System.out.println(p.ToJson().toString());
        
        // esposa:
        Persona esposa = new Persona("Ana", 28);
        
        System.out.println(esposa.ToJson().toString());
        
        // hijos
        Persona[] hijos = new Persona[2];
        
        // hijo1:
        Persona hijo1 = new Persona("Pedro", 5);
        // hijo2:
        Persona hijo2 = new Persona("María", 3);
        
        // hijo1 y 2 en hijos:
        hijos[0] = hijo1;
        hijos[1] = hijo2;
        
        // esposa e hijos en padre:
        p.AsignarEsposa(esposa);
        p.AsignarHijos(hijos);

        System.out.println(p.ToJson().toString());
    }
}
