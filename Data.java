import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data {


    public void datos(Obj_Estudiante_Ingenieria eti){

    

     LinkedList <Obj_Estudiante_Ingenieria> listaEstInge = new LinkedList<>();
        listaEstInge.add(eti);

        for (Obj_Estudiante_Ingenieria estudiante : listaEstInge) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getApellido());
        }

    }
    
}
