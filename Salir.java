import javax.swing.JOptionPane;

public class Salir {

    public void Menu_Salir() {
        int opcion;
        
        // Mostramos el menú de opciones
        String[] opciones = {"Ingresar otro registro", "Menú principal", "Salir"};
        opcion = JOptionPane.showOptionDialog(
            null,
            "¿Que desea realizar ahora?",
            "Menú de Opciones",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        
        // Según la opción seleccionada, realizamos una acción
        switch (opcion) {
            case 0:
                break;
            case 1:
                Menu_opciones mn =new Menu_opciones();
                mn.opcionesprincipales();
            case 2:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    } 
}
