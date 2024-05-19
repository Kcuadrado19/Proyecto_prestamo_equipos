public class Menu_estudiante {

    public String switches_est(String op){

        switch(op)  {

            case "Estudiante de Ingeniería":
                Menu_Est_Ingenieria mi = new Menu_Est_Ingenieria();
                String opc= mi.opciones_est_ingenieria();
                Submenu_Est_Ingenieria si = new Submenu_Est_Ingenieria();
                si.switches_est_Ingenieria(opc);
                break;

            case "Estudiante de Diseño":
                Menu_est_diseno md = new Menu_est_diseno();
                String op1= md.opciones_est_diseno();
                break;
        
            case "Mostrar Inventario Total":

                break;
            default:

                break;

        }
        return null;

    }
    
}
