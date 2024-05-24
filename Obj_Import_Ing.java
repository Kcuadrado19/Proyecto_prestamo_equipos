class Obj_Import_Ing {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int semestreActual;
    private double promedioAcumulado;
    private String serial;
    private String marca;
    private double tamano;
    private double precio;
    private String sistema_operativo;
    private String procesador;

    //Constructor
    public Obj_Import_Ing(String cedula, String nombre, String apellido, String telefono, int semestreActual,
            double promedioAcumulado, String serial, String marca, double tamano, double precio,
            String sistema_operativo, String procesador) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.semestreActual = semestreActual;
        this.promedioAcumulado = promedioAcumulado;
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistema_operativo = sistema_operativo;
        this.procesador = procesador;
    }

    //Getter and Setter
    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public int getSemestreActual() {
        return semestreActual;
    }


    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }


    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }


    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }


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


    public double getTamano() {
        return tamano;
    }


    public void setTamano(double tamano) {
        this.tamano = tamano;
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
