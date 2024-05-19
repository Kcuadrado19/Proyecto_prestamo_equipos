import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido al programa de préstamo de de la universidad San Juan de Dios","San Juan de Dios",1);
        Menu_opciones mn =new Menu_opciones();
        Menu_estudiante me = new Menu_estudiante();
        
        String op= mn.opcionesprincipales();
        me.switches_est(op);
        
    }

}
