package TP_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Perro p = new Perro();Persona per = new Persona();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();        
        boolean band = true;
        
        do {            
            System.out.println("----Menu Principal----");
            System.out.println("1. Agregar Mascotas\n2. Agregar Personas\n3. Adopción"
                    + "\n4. Ver Adopción\n5. Salir");
            int opc = leer.nextInt();
            switch(opc){
                case 1:
                    Perro perro = p.crearPerro();
                    perros.add(perro);
                    break;
                case 2:
                    if(perros.isEmpty())
                        System.out.println("No se puede agregar pesona, no existe perros para adoptar");
                    else{
                       Persona persona = new Persona();
                       personas.add(per);
                    }
                    break;
                case 3:
                    if(personas.isEmpty())
                        System.out.println("El listado de adopción se encuentra vacio");
                    else{
                        verPerro(perros);
                    }
                    break;
                case 4:
                    verAdopcion(personas);
                    break;
                case 5:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (band);
    }
    
    public static void verPerro(ArrayList<Perro> perros){
        for (Perro p : perros) {
            System.out.println(p);
        }
    }
    
    public static void adoptar(ArrayList<Perro> perros, ArrayList<Persona> personas){
        System.out.println("Ingrese el nombre del perro a adoptar");
        String nombre = leer.next();
        Iterator<Perro> it = perros.iterator();
        
        while (it.hasNext()) {
            Perro next = it.next();
            if(next.getNombre().equals(nombre)){
               
            }
        }
        
    }
    
    public static void verAdopcion(ArrayList<Persona> personas){
        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }
}
