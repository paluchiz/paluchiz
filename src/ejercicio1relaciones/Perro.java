/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
package ejercicio1relaciones;*/

/**
 *
 * @author palu_
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    
    public void Perro(){
        
    }
    public Persona(String nombre, String raza, Int edad,String tamanio){
        this.nombre=nombre;
       this.edad=edad;
       this.raza=raza;
       this.tamanio=tamanio;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    @Override
    public String toString(){
        return"Perro{"+"nombre="+nombre +", raza="+ raza + " , edad="+edad + ", tamanio="+ tamanio +'}'
    }
    public void crearPerro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLdlsocale(Locale.US);
        System.out.println("Ingrese el nombre de perro");
        nombre=leer.next();
        System.out.println("Ingrese la raza");
    raza=leer.next();
        System.out.println("Ingrese la edad: ");
        edad=leer.nextInt();
        System.out.println("Ingrese el tamaño: ");
        tamanio=leer.next();
    }
    
    

}
