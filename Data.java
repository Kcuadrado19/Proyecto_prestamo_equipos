import java.util.LinkedList;

public class Data {
    LinkedList<Obj_Import_Ing> listaCombinadaInge = new LinkedList<>();
    LinkedList<Obj_Import_dis> listaCombinadaDis = new LinkedList<>();

    public void datos_import(Obj_Import_Ing oii){

        listaCombinadaInge.add(oii);
    }

    public void datos_import_dis(Obj_Import_dis oid){

        listaCombinadaDis.add(oid);
    }

    public void datos(Obj_Estudiante_Ingenieria eti, Obj_Computador_Portatil ocp){

        LinkedList<Object> listaCombinadaInge = new LinkedList<>();
    
        listaCombinadaInge.add(eti);
        listaCombinadaInge.add(ocp);

    }

    public  void datosd(Obj_estudiante_diseno etd,  Obj_tableta_grafica btg){

     LinkedList<Object> listaCombinadaDis = new LinkedList<>();
    
     listaCombinadaDis.add(etd);
     listaCombinadaDis.add(btg);

    }  
 
}
