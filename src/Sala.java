public class Sala {
    private int codigoSala;
    private String descripcion;

    public Sala(int codigoSala, String descripcion){
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString(){
        return "Sala : {codigoSala = " + codigoSala + ", descripcion = " + descripcion + "}";
    }
}
