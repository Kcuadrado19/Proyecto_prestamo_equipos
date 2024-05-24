import javax.swing.JOptionPane;

public class Registrar_Est_Ingenieria {


    public void ingresarDatos() {
        String nombre, apellido, cedula, telefono, semestreStr, promedioStr, serial, marca, tamanostr, preciostr;
        int semestre = 0;
        float promedio = 0.0f, tamano = 0.0f, precio=0.0f;
            
        
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
            semestreStr = JOptionPane.showInputDialog("Ingrese el número de semestre actualmente cursado:");
            if (!semestreStr.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "El número de semestre solo puede contener números.");
            } else {
                semestre = Integer.parseInt(semestreStr);
                if (semestre> 10) {
                    JOptionPane.showMessageDialog(null, "El semestre no puede ser mayor a 10.");
                }
            }
        } while (!semestreStr.matches("[0-9]+") || semestre > 10 || semestreStr.isEmpty());
        
        semestre = Integer.parseInt(semestreStr);
        
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
        
        
        
        do {
            serial = JOptionPane.showInputDialog("Ingrese el serial:");
            if (!serial.matches("[a-zA-Z0-9]+")) {
                JOptionPane.showMessageDialog(null, "El serial solo puede contener letras y números.");
            }
        } while (!serial.matches("[a-zA-Z0-9]+"));

        do {
            marca = JOptionPane.showInputDialog("Ingrese su marca:");
            if (!marca.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "La marca solo puede contener letras.");
            }
        } while (!marca.matches("[a-zA-Z]+"));

        do {
            tamanostr = JOptionPane.showInputDialog("Ingrese el tamaño del equipo en pulgadas:");
            if (!tamanostr.matches("\\d*\\.?\\d+")) {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser un número válido.");
            }
        } while (!tamanostr.matches("\\d*\\.?\\d+")|| tamanostr.isEmpty());
             tamano = Float.parseFloat(tamanostr);

        do {
            preciostr = JOptionPane.showInputDialog("Ingrese el precio del equipo en pulgadas:");
            if (!preciostr.matches("\\d*\\.?\\d+")) {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser un número válido.");
            }
        } while (!preciostr.matches("\\d*\\.?\\d+")|| preciostr.isEmpty());
             precio = Float.parseFloat(preciostr);    
    
        

        Obj_Estudiante_Ingenieria eti = new Obj_Estudiante_Ingenieria(cedula,nombre,apellido,telefono,semestre,promedio,serial);
        Data dt= new Data();
        dt.datos(eti);
        
        JOptionPane.showMessageDialog(null, "Datos ingresados:\nNombre: " + nombre +
                "\nApellido: " + apellido + "\nCédula: " + cedula + "\nTeléfono: " + telefono +
                "\nSemestre actualmente cursado: " + semestre + "\nPromedio acumulado: " + promedio +
                "\nSerial: " + serial);
    }
}
