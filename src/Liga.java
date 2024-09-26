import java.util.ArrayList;

public class Liga {
    private String nombre;
    private static int SIG_COD_LIGA=0;
    private final int COD_LIGA;
    private ArrayList<Equipo> equipos;

    public Liga(String nombre){
        this.nombre = nombre;
        COD_LIGA = SIG_COD_LIGA;
        SIG_COD_LIGA++;
        equipos = new ArrayList<Equipo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getSIG_COD_LIGA() {
        return SIG_COD_LIGA;
    }

    public int getCOD_LIGA() {
        return COD_LIGA;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
}
