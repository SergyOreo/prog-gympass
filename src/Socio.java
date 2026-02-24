public class Socio {
    private final int numeroSocio;
    private final String nombre;

    /**
     * Constructor de Socios
     * @param numeroSocio
     * @param nombre
     */
    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    /**
     * Getter numeroSocio
     * @return int numeroSocio
     */
    public int getNumeroSocio() {
        return numeroSocio;
    }

    /**
     * Getter Nombre de Socio
     * @return String Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve Socio con sus atributos asignados
     * @return String de socio con sus atributos
     */
    @Override
    public String toString(){
        return "Socio : {numeroSocio = " + numeroSocio + "; nombre = " + nombre + "}";
    }
}
