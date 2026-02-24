public class Sala {
    private int codigoSala;
    private String descripcion;

    /**
     * Constructor de Sala
     * @param codigoSala
     * @param descripcion
     */
    public Sala(int codigoSala, String descripcion){
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    /**
     * Getter de CodigoSala
     * @return int codigoSala
     */
    public int getCodigoSala() {
        return codigoSala;
    }

    /**
     * Getter de descripcion
     * @return String descripcion de Sala
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sala con sus atributos
     * @return String de Sala con atributos
     */
    public String toString(){
        return "Sala : {codigoSala = " + codigoSala + ", descripcion = " + descripcion + "}";
    }
}
