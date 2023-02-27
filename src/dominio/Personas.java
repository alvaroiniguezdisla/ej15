package dominio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Personas {
    public void annadirPersona(Persona persona, ArrayList<Persona> listaPersonas){
        listaPersonas.add(persona);
    }
    public static Persona elMasJoven(ArrayList<Persona> listaPersonas) {
        return Stream.iterate(0, i -> i + 1).limit(listaPersonas.size()).map(i -> listaPersonas.get(i)).min(Comparator.comparing(Persona::calcularEdad)).get();
    }
    public static long calcularSumaEdades(ArrayList<Persona> listaPersonas){
        return Stream.iterate(0, i -> i + 1).limit(listaPersonas.size()).map(i -> listaPersonas.get(i)).mapToLong(Persona::calcularEdad).sum();
    }

    public static long calcularEdadMinima(ArrayList<Persona> listaPersonas){
        return Stream.iterate(0,i->i+1).limit(listaPersonas.size()).map(i->listaPersonas.get(i)).mapToLong(Persona::calcularEdad).min().getAsLong();
    }
    public static double calcularMediaDeEdad(ArrayList<Persona> listaPersonas){
        return Stream.iterate(0,i->i+1).limit(listaPersonas.size()).map(i->listaPersonas.get(i)).mapToLong(Persona::calcularEdad).average().getAsDouble();
    }



}
