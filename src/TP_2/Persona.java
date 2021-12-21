package TP_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private ArrayList<Perro> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perros=" + perros + '}';
    }

    private Scanner leer =new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
      Persona p = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        p.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona");
        p.setDocumento(leer.nextLong());
        return p;
    }
}
