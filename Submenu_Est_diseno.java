import javax.swing.JOptionPane;

public class Submenu_Est_diseno {

    public String switches_est_diseno(String op1){
    
        switch(op1)  {
            case "Cargar Datos":
                Import_Est_Ingenieria iei = new Import_Est_Ingenieria();
                iei.Import_Ingenieria();
                break;

            case "Registrar préstamo de equipo":
                boolean continuar = true;
                    
                while (continuar) {
                    String[] opciones = {"Ingresar datos", "Salir"};
                    int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:",
                            "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, opciones, opciones[0]);
                    
                    switch (opcionSeleccionada) {
                        case 0:
                            Registrar_Est_diseno rd = new Registrar_Est_diseno();
                            rd.ingresarDatos();
                            break;
                        case 1:
                            continuar = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                            break; }
                }
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
