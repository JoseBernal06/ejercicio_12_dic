public class Cantante extends Persona{
    public Cantante(String cedula, String nombre, String DOB) {
        super(cedula, nombre, DOB);
    }

    @Override
    public void Saludo() {
        System.out.println("Hola cantantes");
    }

    @Override
    public double impuesto(double sueldo) {
        return sueldo;
    }
}
