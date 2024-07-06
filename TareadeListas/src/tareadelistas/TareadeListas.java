/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareadelistas;

/**
 *
 * @autor user
 */
public class TareadeListas {
    public static void main(String[] args) {
        ListaPersonas lista = new ListaPersonas();

        lista.agrega(new Persona(1, "Juan"));
        lista.agrega(new Persona(2, "Carlos"));
        lista.agrega(new Persona(3, "Tilin"));

        System.out.println("Personas en la lista:");
        lista.muestraPersonas();

        System.out.println("\nExiste persona con ID 2? " + lista.existe(2));

        lista.modifica(new Persona(2, "Bobby"));

        System.out.println("\nPersonas en la lista despues de la modificacion:");
        lista.muestraPersonas();

        lista.elimina(1);

        System.out.println("\nPersonas en la lista despues de la eliminacion:");
        lista.muestraPersonas();

        Persona extraida = lista.extrae(3);
        System.out.println("\nPersona extraida: ID: " + extraida.getId() + ", Nombre: " + extraida.getNombre());

        System.out.println("\nPersonas en la lista despues de la extraccion:");
        lista.muestraPersonas();
    }
}