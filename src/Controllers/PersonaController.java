package Controllers;
import Models.Persona;
public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas) {
        int tam = personas.length;

        for (int i = 0; i < tam; i++) {
            int max = i;
            for (int j = i + 1; j < tam; j++) {
                if (personas[j].compareCodigoDireccion(personas[i])) {
                    max = j;
                }
            }
            if (i != max) {
                Persona temp = personas[max];
                personas[max] = personas[i];
                personas[i] = temp;
            }

        }
    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int center = (alto + bajo) / 2;
            if (personas[center].equalsByCodeDireccion(codigo)) {
                return personas[center];
            }

            if (personas[center].compareCodigoDireccion(codigo)) {
                bajo = center + 1;
            } else {
                alto = center - 1;
            }
        }
        return null;
    }
    
}
