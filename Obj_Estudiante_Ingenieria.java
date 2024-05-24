public class Obj_Estudiante_Ingenieria {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int semestreActual;
    private double promedioAcumulado;
    //private String serial;

    // Constructor
    public Obj_Estudiante_Ingenieria (String cedula, String nombre, String apellido, String telefono, int semestreActual, double promedioAcumulado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.semestreActual = semestreActual;
    }

    //Metodos Getter and Setter
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
    
}
