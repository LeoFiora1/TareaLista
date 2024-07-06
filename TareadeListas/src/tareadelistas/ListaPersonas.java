/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareadelistas;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class ListaPersonas {
    private ArrayList<Persona> personas;

    public ListaPersonas() {
        personas = new ArrayList<>();
    }

    public boolean existe(int id) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void modifica(Persona p) {
        for (Persona persona : personas) {
            if (persona.getId() == p.getId()) {
                persona.setNombre(p.getNombre());
                break;
            }
        }
    }

    public void elimina(int id) {
        personas.removeIf(persona -> persona.getId() == id);
    }

    public Persona extrae(int id) {
        Persona personaAEliminar = null;
        for (Persona p : personas) {
            if (p.getId() == id) {
                personaAEliminar = p;
                break;
            }
        }
        if (personaAEliminar != null) {
            personas.remove(personaAEliminar);
        }
        return personaAEliminar;
    }

    public void agrega(Persona p) {
        personas.add(p);
    }

    public void muestraPersonas() {
        for (Persona p : personas) {
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre());
        }
    }
}
