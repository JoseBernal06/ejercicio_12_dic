public class Deportista extends Persona{
    public Deportista(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public Deportista(String cedula, String nombre, String DOB) {
        super(cedula, nombre, DOB);
    }

    @Override
    public void Saludo() {
        System.out.println("Hola deportistas...");
    }

    @Override
    public double impuesto(double sueldo) {
        double impuesto=sueldo*0.15;
        return impuesto;
    }


}
