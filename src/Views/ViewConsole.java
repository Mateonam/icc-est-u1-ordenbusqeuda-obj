package Views;
import Models.Persona;
public class ViewConsole {

    public void printArray(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        System.out.println();
    }
}
