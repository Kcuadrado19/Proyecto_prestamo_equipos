import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Data {
    LinkedList<Obj_Import_Ing> listaCombinadaInge = new LinkedList<>();
    LinkedList<Obj_Import_dis> listaCombinadaDis = new LinkedList<>();

    public Obj_Import_Ing datos_import(Obj_Import_Ing oii){

        listaCombinadaInge.add(oii);

        for (Obj_Import_Ing persona : listaCombinadaInge) {
            System.out.println(persona.getCedula()+" "+persona.getNombre()+" "+persona.getApellido());
        }
        return null;
    }

    public Obj_Import_dis datos_import_dis(Obj_Import_dis oid){

        listaCombinadaDis.add(oid);

        for (Obj_Import_dis persona : listaCombinadaDis) {
            System.out.println(persona.getCedula()+" "+persona.getNombre()+" "+persona.getApellido());
        }
        return null;
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

    public void buscar(){
        String cedula;
        cedula = JOptionPane.showInputDialog("Ingrese su cédula:");
        if (!cedula.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "La cédula solo puede contener números.");
            return; // Regresar si la cédula no es válida
        }

        boolean encontrado = false;
        for (Obj_Import_Ing persona : listaCombinadaInge) {
            if (persona.getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(null, "El apellido de esta persona es: " + persona.getApellido());
                encontrado = true;
                break; // Terminar el bucle si se encuentra la persona
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna persona con la cédula ingresada.");
        }
    }
}