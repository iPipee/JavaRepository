package jdbc.test;

import java.util.List;

import jdbc.datos.PersonaDAO;
import jdbc.domain.Persona;

public class ManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertando nuevo objeto de tipo Persona
      /*  Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "+56978552112");
        personaDao.insertar(personaNueva);
        */ 

        //Modificar persona
       /*  Persona personaModificar = new Persona(3, "Carlos", "Esparza", "jcesparza@gmail.com", "+56978552112");
        personaDao.actualizar(personaModificar);
        */

        //Eliminar persona
        Persona personaELiminar = new Persona(3);
        personaDao.eliminar(personaELiminar);
        List<Persona> personas = personaDao.seleccionar();  

        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
