import javax.swing.*;
import java.awt.*;

public class Menu_est_diseno {

    String opcionSeleccionada="";
    public String opciones_est_diseno() {

        // Cambiar el color de fondo del cuadro de diálogo
        UIManager.put("OptionPane.background", Color.lightGray);
        UIManager.put("Panel.background", Color.LIGHT_GRAY);

        // Opciones que se mostrarán en el JComboBox
        String[] opciones = {"Registrar préstamo de equipo", "Modificar préstamo de equipo", "Devolución de equipo","Buscar equipo", "Volver al menú principal"};

        // Mensaje que se mostrará en el cuadro de diálogo
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        // Crear el panel que contendrá el JComboBox
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Elige una opción:");
        label.setFont(new Font("Bahnschrift", Font.PLAIN, 14)); // Cambiar la fuente
        panel.add(label);
        comboBox.setFont(new Font("Bahnschrift", Font.PLAIN, 12)); // Cambiar la fuente del JComboBox
        panel.add(comboBox);

         // Cambiar el color de fondo y el tipo de letra de la lista desplegable
        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                c.setBackground(Color.LIGHT_GRAY); // Cambiar el color de fondo
                c.setFont(new Font("Bahnschrift", Font.PLAIN, 12)); // Cambiar el tipo de letra
                return c;
            }
        });

        // Mostrar el cuadro de diálogo
        int resultado = JOptionPane.showConfirmDialog(
            null, // Componente padre (en este caso, ninguno)
            panel, // Componente que se mostrará en el cuadro de diálogo
            "Cuadro de opciones", // Título del cuadro de diálogo
            JOptionPane.OK_CANCEL_OPTION, // Tipo de opción (puede ser cambiado)
            JOptionPane.PLAIN_MESSAGE // Tipo de mensaje (puede ser cambiado)
        );

        // Verificar qué opción seleccionó el usuario
        if (resultado == JOptionPane.OK_OPTION) {
            opcionSeleccionada = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
        } else {
            System.out.println("El usuario cerró el cuadro de diálogo sin seleccionar ninguna opción.");
        }
        return opcionSeleccionada;
        
    }
}
