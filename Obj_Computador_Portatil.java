public class Obj_Computador_Portatil {
    private String serial;
    private String marca;
    private double tamano;
    private double precio;
    private String sistema_operativo;
    private String procesador;
    
    // Constructor
    public Obj_Computador_Portatil(String serial, String marca, double tamano, double precio, String sistema_operativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistema_operativo = sistema_operativo;
        this.procesador = procesador;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    //Metodos Getter and Setter
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamano;
    }

    public void setTamaño(double tamaño) {
        this.tamano = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

}