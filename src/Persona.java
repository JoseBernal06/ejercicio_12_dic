public class Persona {
    String cedula;
    String nombre;
    String DOB;
    String tipo_sangre;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona(){

    }

    public Persona(String cedula, String nombre, String DOB) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.DOB = DOB;
    }

    public void Saludo(){
        System.out.println("Hello..");
    }

    public double impuesto(double sueldo){
        double impuesto=sueldo*0.25;
        return impuesto;
    }
}
