import javax.swing.JOptionPane;

public class Registrar_Est_diseno {

    public void ingresarDatos() {
        String nombre, apellido, cedula, telefono, modalidad, cantidadStr,marca,tamanostr, serial,almacenamiento, preciostr,pesostr;
        int cantidadasig = 0;
        float  tamano =0.0f, precio =0.0f, peso =0.0f;
        String[] opciones = {"Presencial", "Virtual"};
        String[] opcionesA = {"256 GB", "512 GB","1 TB" };
        
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

             int opcionModalidadEst;
             boolean opcionValidaModalidad;
        do {
                opcionModalidadEst = JOptionPane.showOptionDialog(null, "Elija la modalidad de estudio:",
                         "Seleccionar modalidad", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                         opciones, null); // Usamos null como valor predeterminado para que no se seleccione ninguna opción inicialmente
     
                 if (opcionModalidadEst == JOptionPane.CLOSED_OPTION) {
                     // El usuario cerró la ventana,
                     return;
                 }
     
                 modalidad = opciones[opcionModalidadEst];
     
                 opcionValidaModalidad = opcionModalidadEst != -1; // Verifica si se ha seleccionado una opción válida
     
                 if (!opcionValidaModalidad) {
                     JOptionPane.showMessageDialog(null, "Elija una de las opciones disponibles.");
                 }
        } while (!opcionValidaModalidad);
        
        do {
            cantidadStr = JOptionPane.showInputDialog("Ingrese el número de asignaturas actualmente cursadas:");
            if (!cantidadStr.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "El número de asignaturas solo puede contener números.");
            } else {
                cantidadasig = Integer.parseInt(cantidadStr);
                if (cantidadasig> 10) {
                    JOptionPane.showMessageDialog(null, "no puedes cursar más de 10 asignaturas.");
                }
            }
        } while (!cantidadStr.matches("[0-9]+") || cantidadasig > 10 || cantidadStr.isEmpty());
        
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
                preciostr = JOptionPane.showInputDialog("Ingrese el precio del equipo:");
                if (!preciostr.matches("\\d*\\.?\\d+")) {
                    JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.");
                }
        } while (!preciostr.matches("\\d*\\.?\\d+")|| preciostr.isEmpty());
                 precio = Float.parseFloat(preciostr); 

        do {
                pesostr = JOptionPane.showInputDialog("Ingrese el peso del equipo:");
                if (!pesostr.matches("\\d*\\.?\\d+")) {
                        JOptionPane.showMessageDialog(null, "El peso debe ser un número válido.");
                }
        } while (!preciostr.matches("\\d*\\.?\\d+")|| pesostr.isEmpty());
                     peso = Float.parseFloat(pesostr);

                     int opcionSeleccionadaAlmacenamiento;
                     boolean opcionValidaAlmacenamiento;
        do {
            opcionSeleccionadaAlmacenamiento = JOptionPane.showOptionDialog(null, "Elija el almacenamiento del equipo:",
                                 "Seleccionar alamacenamiento", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                                 opcionesA, null); // Usamos null como valor predeterminado para que no se seleccione ninguna opción inicialmente
             
             if (opcionSeleccionadaAlmacenamiento == JOptionPane.CLOSED_OPTION) {
                 // El usuario cerró la ventana,
                    return;
                }
             
                         almacenamiento = opcionesA[opcionSeleccionadaAlmacenamiento];
             
                         opcionValidaAlmacenamiento = opcionSeleccionadaAlmacenamiento != -1; // Verifica si se ha seleccionado una opción válida
             
                         if (!opcionValidaAlmacenamiento) {
                             JOptionPane.showMessageDialog(null, "Elija una de las opciones disponibles.");
                         }
        } while (!opcionValidaAlmacenamiento);
        
       
        Obj_estudiante_diseno etd = new Obj_estudiante_diseno(cedula,nombre,apellido,telefono,modalidad,cantidadasig);
        Obj_tableta_grafica btg= new Obj_tableta_grafica(serial, marca, tamano, precio, almacenamiento, peso);
        Data dtd= new Data();
        dtd.datosd(etd,btg);

        JOptionPane.showMessageDialog(null, "Datos ingresados:\nNombre: " + nombre +
                "\nApellido: " + apellido + "\nCédula: " + cedula + "\nTeléfono: " + telefono +
                "\nAsignaturas cursadas: " + cantidadasig + "\nModalidad: " + modalidad +
                "\nSerial: " + serial+ "\nMarca: " + marca+ "\nTamaño: " + tamano+ "\nPrecio: " + precio+ "\nAlmacenamiento: " + almacenamiento+"\nPeso: " + peso );

        Salir s=new Salir();
        s.Menu_Salir();
    }
}
