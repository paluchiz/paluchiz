/*
 Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
package ejercicio1relaciones;*/

package ejercicio1relaciones;

import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Persona person1=new Persona():
        Perona person2=new Persona();
        Perro perro1=new Perro();
        Perro perro2=new Perro();
        System.out.println("Cargar persona 1");
        person1.crearPersona();
        System.out.println("Cargar persona 2");
        person2.crearPersona();
        System.out.println("Cargar perro 1");
        perro1.crearPerro();
        System.out.println("Cargar perro 2");
        perro2.crearPerro();
        Persona1.vincularPerro(perro1);
        Persona2.vincularPerro(perro2);
        System.out.println("Informacion persona 1");
        System.out.println(person1.toString());
        System.out.println("Informacion persona 2");
        System.out.println(person2.toString());
    }
    
}
