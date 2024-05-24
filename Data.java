import java.util.LinkedList;

public class Data {

    public void datos(Obj_Estudiante_Ingenieria eti, Obj_Computador_Portatil ocp){

        LinkedList <Obj_Estudiante_Ingenieria> listaEstInge = new LinkedList<>();
        LinkedList <Obj_Computador_Portatil> listaComp = new LinkedList<>();
            listaEstInge.add(eti);
            listaComp.add(ocp);

        LinkedList<Object> listaCombinadaInge = new LinkedList<>();
    
        listaCombinadaInge.add(eti);
        listaCombinadaInge.add(ocp);
    
        // la listaCombinada contiene elementos de ambos tipos objetos de tipo Obj_Estudiante_Ingenieria como objetos de tipo Obj_Computador_Portatil. Sin embargo, tener en cuenta que ahora se necesita manejar la conversión de tipos cuando se recuperen elementos de esta lista combinada.    
        /*
        for (Object elemento : listaCombinadaInge) {
            //System.out.println("Nombre: " + elemento.getNombre() + ", Edad: " + elemento.getApellido());
            System.out.println(elemento.toString());
        } */

    }

    public  void datosd(Obj_estudiante_diseno etd,  Obj_tableta_grafica btg){

     LinkedList<Object> listaCombinadaDis = new LinkedList<>();
    
     listaCombinadaDis.add(etd);
     listaCombinadaDis.add(btg);

    }  
    
}
