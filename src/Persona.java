public class Persona extends Cuenta {
    private double edad;
    private String identificacion;
    private String nombre;

    public Persona(String numero, String tipo, double valorInicial, double edad, String identificacion, String nombre) {
        super(numero, tipo, valorInicial);
        this.edad = edad;
        this.identificacion = identificacion;
        this.nombre = nombre;

    }

}
