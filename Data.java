import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data {


    public void datos(Obj_Estudiante_Ingenieria eti, Obj_Computador_Portatil ocp){

    

     LinkedList <Obj_Estudiante_Ingenieria> listaEstInge = new LinkedList<>();
     LinkedList <Obj_Computador_Portatil> listaComp = new LinkedList<>();
        listaEstInge.add(eti);
        listaComp.add(ocp);

    LinkedList<Object> listaCombinada = new LinkedList<>();
    
     listaCombinada.add(eti);
     listaCombinada.add(ocp);
    
    // la listaCombinada contiene elementos de ambos tipos objetos de tipo Obj_Estudiante_Ingenieria como objetos de tipo Obj_Computador_Portatil. Sin embargo, tener en cuenta que ahora se necesita manejar la conversión de tipos cuando se recuperen elementos de esta lista combinada.

        

        for (Object elemento : listaCombinada) {
            //System.out.println("Nombre: " + elemento.getNombre() + ", Edad: " + elemento.getApellido());
            System.out.println(elemento.toString());
        }

        //LinkedList <Obj_Estudiante_Ingenieria> listac = new LinkedList<>();
        //listaEstInge.add(eti);

    }

    

        
       




    
    
}
