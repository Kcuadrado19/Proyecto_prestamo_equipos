import javax.swing.JOptionPane;

public class Salir {

    public String Menu_Salir() {
        int opcion;
        
        // Mostramos el menú de opciones
        String[] opciones = {"Si", "No"};
        opcion = JOptionPane.showOptionDialog(
            null,
            "¿Desea volver al menú principal?",
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
                Menu_opciones mn =new Menu_opciones();
                mn.opcionesprincipales();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
        return null;
    } 
}
