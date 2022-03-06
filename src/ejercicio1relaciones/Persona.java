/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.*/

package ejercicio1relaciones;

import java.util.Locale;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer edad;
    private Perro perro;


    public void Persona(){
        
    }
    public Persona(String nombre, String apellido, Integer dni,  Integer edad,Perro perro){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.perro=perro;
        this.edad=edad;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    @Override
    public String toString (){
        return "Persona {"+"nombre="+ nombre + " , apellido ="+ apellido + ", edad= " +edad + " dni =" +  dni +" , perro ="++ perro '}';
    
    }
    
public void crearPersona(){
Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
System.out.println("Ingrese el nombre y apellido :");
nombre=leer.next();
apellido=leer.next();
System.out.println("Ingrese la edad: ");
edad=leer.nextInt();
System.out.println("Ingrese el dni: ");
dni=leer.nextInt();

}
public void crearVinculo(){
    this.perro=perro;
}
}
