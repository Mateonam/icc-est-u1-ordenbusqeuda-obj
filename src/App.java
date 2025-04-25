import Controllers.PersonaController;
import Models.Direccion;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un arreglo de 5 personas
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30,
        new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5",56, 86));
    
        ViewConsole vC = new ViewConsole();
        PersonaController pC = new PersonaController();
        vC.printArray(personas);
        pC.sortByDireccionCodigo(personas);
        vC.printArray(personas);
        Persona ps = pC.findPersonaByCodigoDireccion(personas, 67);
        System.out.println(ps == null ? "Persona no existe" : "La persona es " + ps);
    }
}
