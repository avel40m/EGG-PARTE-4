package TP_2;

import java.util.Scanner;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private double tamano;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, double tamano) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tamano=" + tamano + '}';
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        Perro p = new Perro();
        System.out.println("Ingresar el nombre del perro");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad del perro");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza del perro");
        p.setRaza(leer.next());
        System.out.println("Ingrese el tamaño del perro");
        p.setTamano(leer.nextDouble());
        return p;
    }
    
}
