public class Obj_tableta_grafica {
    private String serial;
    private String marca;
    private float tamano;
    private float precio;
    private String almacenamiento;
    private float peso;

    //Constructor
    public Obj_tableta_grafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    //Getter y setter
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

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }  
}
