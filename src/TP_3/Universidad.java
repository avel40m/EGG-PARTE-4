package TP_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Universidad {

    private String nombre;
    private String lugar;
    private Date anoInaguracion;
    private int empleados;

    public Universidad() {
    }

    public Universidad(String nombre, String lugar, Date anoInaguracion, int empleados) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.anoInaguracion = anoInaguracion;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getAnoInaguracion() {
        return anoInaguracion;
    }

    public void setAnoInaguracion(Date anoInaguracion) {
        this.anoInaguracion = anoInaguracion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", lugar=" + lugar + ", anoInaguracion=" + anoInaguracion + ", empleados=" + empleados + '}';
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearUniversidad(){
        System.out.println("Ingrese el nombre de la facultad");
        nombre = leer.next();
        System.out.println("Ingrese el lugar de la unviersidad "+ nombre);
        lugar = leer.next();
        System.out.println("Ingrese el año de la universidad");
        anoInaguracion = pasarFecha(leer.next());
        System.out.println("Ingrese cantidad de empleado");
        empleados = leer.nextInt();
        
    }
    
    private Date pasarFecha(String dia){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        
        try {
            fecha = formato.parse(dia);
        } catch (Exception e) {
            e.getMessage();
        }
        return fecha;
    }
    
}
