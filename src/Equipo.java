public class Equipo {
    private static int SIG_COD_EQUIPO = 0;

    private static final int MAX_JUGADORES=20;
    private final int COD_EQUIPO;
    private String nombre;
       
    private Jugador[] jugadores;
    private Entrenador entrenador;

    public Equipo(String nombre) {
        this.nombre = nombre;
        COD_EQUIPO = SIG_COD_EQUIPO;
        SIG_COD_EQUIPO++;
        jugadores = new Jugador[MAX_JUGADORES];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCOD_EQUIPO() {
        return COD_EQUIPO;
    }

    public static int getSIG_COD_EQUIPO() {
        return SIG_COD_EQUIPO;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

}
