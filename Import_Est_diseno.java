import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Import_Est_diseno {

    public void Import_diseno() {

        LinkedList<Obj_Import_dis> import_dis = new LinkedList<>();
        File file = new File("C:/Users/Jesus Suarez/OneDrive - onbusinessconsulting.com/Documentos/Java/Estructura/Prueba Import/DB_Estudiante_Diseno.txt"); // Cambia la ruta al archivo

        try (Scanner scanner = new Scanner(file)) {
            // Ignorar la primera línea si contiene encabezados
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Saltar la primera línea (encabezados)
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 12) { // Asumiendo que hay 6 campos en cada línea
                    Obj_Import_dis oid = new Obj_Import_dis(parts[0], parts[1], parts[2],parts[3], parts[4], Integer.parseInt(parts[5]),parts[6],parts[7],Double.parseDouble(parts[8]),Double.parseDouble(parts[9]),parts[10],Double.parseDouble(parts[11]));
                    Data dt= new Data();
                    dt.datos_import_dis(oid);
                } else {
                    System.out.println("Error: La línea no contiene todos los campos esperados.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            e.printStackTrace();
        }

    }
}
