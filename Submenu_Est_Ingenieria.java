public class Submenu_Est_Ingenieria {

    public String switches_est_Ingenieria(String opc){
    
        switch(opc)  {

            case "Registrar préstamo de equipo":
                System.out.println("Registrar datos de prestamo");
                Salir s=new Salir();
                s.Menu_Salir();

                break;

            case "Modificar préstamo de equipo":
                System.out.println("Modificar datos de prestamo");
                break;
        
            case "Devolución de equipo":
                System.out.println("Devolver prestamo");

                break;
            
            case "Buscar equipo":
                System.out.println("Buscar datos de prestamo");

                break;

            default:

                break;

        }
        return null;

    }
    
}
//String[] opciones = {"Volver al menú principal"};
