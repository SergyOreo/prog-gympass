public class Socio {
    private final int numeroSocio;
    private final String nombre;

    /**
     *
     * @param numeroSocio
     * @param nombre
     */
    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "Socio : {numeroSocio = " + numeroSocio + "; nombre = " + nombre + "}";
    }
}
