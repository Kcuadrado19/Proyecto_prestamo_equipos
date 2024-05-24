import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Import_Est_Ingenieria {

    public void Import_Ingenieria() {

        LinkedList<Obj_Import_Ing> import_ing = new LinkedList<>();
        // Obtener la ruta relativa del archivo
        String filePath = "DB_Estudiante_Ingenieria.txt"; // Cambia el nombre del archivo si es diferente

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Ignorar la primera línea si contiene encabezados
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Saltar la primera línea (encabezados)
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 12) { // Asumiendo que hay 6 campos en cada línea
                    Obj_Import_Ing oii = new Obj_Import_Ing(parts[0], parts[1], parts[2],parts[3], Integer.parseInt(parts[4]), Double.parseDouble(parts[5]),parts[6],parts[7],Double.parseDouble(parts[8]),Double.parseDouble(parts[9]),parts[10],parts[11]);
                    Data dt= new Data();
                    dt.datos_import(oii); 
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
