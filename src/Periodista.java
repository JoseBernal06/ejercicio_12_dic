public class Periodista extends Persona{
    //String luga_trabajo;
    public Periodista(String cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public void Saludo() {
        System.out.println("Hola periodistas....");
    }

    @Override
    public double impuesto(double sueldo) {
        double impuesto=sueldo*0.40;
        return impuesto;
    }
}
