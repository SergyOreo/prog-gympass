public class Main {
    public static void main(String[] args){
        Socio socio1;
        Socio socio2;

        Sala sala1;
        Sala sala2;

        socio1 = new Socio(1,"Elena");
        socio2 = new Socio(2,"Sheila");

        sala1 = new Sala(1,"Recepción");
        sala2 = new Sala(2,"Vestuarios");

        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
        System.out.println(sala1.toString());
        System.out.println(sala2.toString());
    }
}
