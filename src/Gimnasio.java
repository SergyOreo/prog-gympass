public class Gimnasio {
    private String codigo;
    private String nombre;
    private Socio listaSocios[];
    private Sala listaSalas[];
    private int responsableId = -1;

    private final int CANTIDAD_MAX_SOCIOS = 10;
    private final int CANTIDAD_MAX_SALAS = 5;
    /**
     * Constructor de Gimnasio
     * @param codigo
     * @param nombre
     */
    public Gimnasio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

        listaSalas = new Sala[CANTIDAD_MAX_SALAS];
        listaSocios = new Socio[CANTIDAD_MAX_SOCIOS];
    }

    /**
     * registra a un socio dentro de listaSocios en la primera posicion libre
     * @param s socio a registrar
     * @return true si se ha registrado correctamente / false si no se ha podido registrar
     */
    public boolean registrarSocio(Socio s) {
        boolean socioRegistrado;
        int huecoLibre;

        huecoLibre = buscarHuecoLibreSocio();

        if (huecoLibre == -1 || buscarSocioPorNumero(s.getNumeroSocio()) != null) {
            socioRegistrado = false;
        } else {
            listaSocios[huecoLibre] = s;
            socioRegistrado = true;
        }

        return socioRegistrado;
    }

    /**
     * Busca un hueco libre dentro del array de listaSocios
     * @return indice del hueco libre / -1 si no hay hueco libre
     */
    public int buscarHuecoLibreSocio(){
        int huecoLibre = -1;
        boolean continuar = true;

        for (int i = 0; i < CANTIDAD_MAX_SOCIOS && continuar; i++) {
            if (listaSocios[i] == null) {
                huecoLibre = i;
                continuar = false;
            }
        }

        return huecoLibre;
    }

    /**
     * Busca socio en la lista de socios por el numero proporcionado
     * @param numeroSocio del socio a buscar
     * @return Socio que coincida con el numero, o null si no se encuentra/no existe
     */
    public Socio buscarSocioPorNumero(int numeroSocio) {
        Socio socio = null;
        boolean continuarBuscando = true;

        for (int i = 0; i < CANTIDAD_MAX_SOCIOS && continuarBuscando; i++) {
            if (numeroSocio == listaSocios[i].getNumeroSocio()) {
                socio = listaSocios[i];
                continuarBuscando = false;
            }
        }

        return socio;
    }

    /**
     * Elimina al socio de listaSocios y devuelve el socio eliminado
     * @param numero del socio al que se quiere eliminar de la lista
     * @return Socio expulsado
     */
    public Socio expulsarSocio(int numero){
        Socio socioAExpulsar;
        int posicionSocio;

        socioAExpulsar = buscarSocioPorNumero(numero);
        if (socioAExpulsar != null) {
            posicionSocio = buscarPosicionSocio(numero);
            if (posicionSocio != -1) {
                listaSocios[posicionSocio] = null;
            }
        }

        return socioAExpulsar;
    }

    /**
     * Busca un socio por su numero de socio y devuelve la posicion en listaSocios
     * @param numero del socio a buscar
     * @return posicion del socio en listaSocios / -1 si no se encuentra
     */
    public int buscarPosicionSocio(int numero){
        int posicionSocio = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < CANTIDAD_MAX_SOCIOS && seguirBuscando; i++) {
            if (numero == listaSocios[i].getNumeroSocio()) {
                posicionSocio = i;
                seguirBuscando = false;
            }
        }

        return posicionSocio;
    }
}
