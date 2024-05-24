import javax.swing.JOptionPane;

public class Registrar_Est_diseno {


    public void ingresarDatos() {
        String nombre, apellido, cedula, telefono, cantidadStr, promedioStr, serial;
        int semestre = 0;
        float promedio = 0.0f, cantidad= 0.0f;
        
        do {
            nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            if (!nombre.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras.");
            }
        } while (!nombre.matches("[a-zA-Z]+"));
        
        do {
            apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
            if (!apellido.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "El apellido solo puede contener letras.");
            }
        } while (!apellido.matches("[a-zA-Z]+"));
        
        do {
            cedula = JOptionPane.showInputDialog("Ingrese su cédula:");
            if (!cedula.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "La cédula solo puede contener números.");
            }
        } while (!cedula.matches("[0-9]+") || cedula.isEmpty());
        
        do {
            telefono = JOptionPane.showInputDialog("Ingrese su teléfono:");
            if (!telefono.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "El teléfono solo puede contener números.");
            } else if (telefono.length() > 10) {
                JOptionPane.showMessageDialog(null, "El teléfono debe tener maximo 10 dígitos.");
            }
        } while (!telefono.matches("[0-9]+") || telefono.length() > 10 || telefono.isEmpty());
        
        do {
            cantidadStr = JOptionPane.showInputDialog("Ingrese el número de semestre actualmente cursado:");
            if (!cantidadStr.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "El número de semestre solo puede contener números.");
            } else {
                semestre = Integer.parseInt(cantidadStr);
                if (cantidad> 10) {
                    JOptionPane.showMessageDialog(null, "no puedes cursar más de 10 asignaturas.");
                }
            }
        } while (!cantidadStr.matches("[0-9]+") || cantidad > 10 || cantidadStr.isEmpty());
        
        semestre = Integer.parseInt(cantidadStr);
        
        do {
            promedioStr = JOptionPane.showInputDialog("Ingrese su promedio acumulado:");
            if (!promedioStr.matches("\\d*\\.?\\d+")) {
                JOptionPane.showMessageDialog(null, "El promedio acumulado debe ser un número válido.");
            } else {
                promedio = Float.parseFloat(promedioStr);
                if (promedio > 5) {
                    JOptionPane.showMessageDialog(null, "El promedio acumulado no puede ser mayor a 5.");
                }
            }
        } while (!promedioStr.matches("\\d*\\.?\\d+") || promedio > 5 || promedioStr.isEmpty());
        
        promedio = Float.parseFloat(promedioStr);
        
        do {
            serial = JOptionPane.showInputDialog("Ingrese el serial:");
            if (!serial.matches("[a-zA-Z0-9]+")) {
                JOptionPane.showMessageDialog(null, "El serial solo puede contener letras y números.");
            }
        } while (!serial.matches("[a-zA-Z0-9]+"));
        
       
        //Obj_estudiante_diseno etd = new Obj_estudiante_diseno(cedula,nombre,apellido,telefono,semestre,promedio,serial);
        //Data dtd= new Data();
        //dtd.datos(etd);

        JOptionPane.showMessageDialog(null, "Datos ingresados:\nNombre: " + nombre +
                "\nApellido: " + apellido + "\nCédula: " + cedula + "\nTeléfono: " + telefono +
                "\nSemestre actualmente cursado: " + semestre + "\nPromedio acumulado: " + promedio +
                "\nSerial: " + serial);
    }
}
