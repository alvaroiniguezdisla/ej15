package aplicacion;
import dominio.*;
import java.util.ArrayList;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona("Juan", LocalDate.of(1990, 1, 1)));
        listaPersonas.add(new Persona("Pedro", LocalDate.of(1995, 1, 1)));
        listaPersonas.add(new Persona("Maria", LocalDate.of(1992, 1, 1)));

        System.out.println("La persona mas joven es "+dominio.Personas.elMasJoven(listaPersonas).getNombre());
        System.out.println("La suma de las edades es "+dominio.Personas.calcularSumaEdades(listaPersonas));
        System.out.println("La edad mínima es "+Personas.calcularEdadMinima(listaPersonas));
        System.out.println("La edad media es "+Personas.calcularMediaDeEdad(listaPersonas));

    }
}
