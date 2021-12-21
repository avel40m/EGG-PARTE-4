
package TP_1;

public class TP_1 {

    public static void main(String[] args) {
        Perro perro = new Perro("Boby", "Boxer", 4, 1.30);
        Persona persona = new Persona("Avelino", "Mendez", 28, 37105291, perro);
        System.out.println(persona.toString());
    }
    
}
