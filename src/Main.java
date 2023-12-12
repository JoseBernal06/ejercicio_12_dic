
public class Main {
    public static void main(String[] args) {

        Persona persona_uno;
        Persona persona_dos;
        Persona persona_tres;
        persona_uno=new Persona();
        persona_dos=new Persona("1752700888","Mateo");
        persona_tres=new Persona("1752700888","Mateo","11-oct-2003");

        Deportista deportista_uno;
        deportista_uno=new Deportista("185966896","Jose");

        Periodista periodista_uno;
        periodista_uno=new Periodista("845415148","Pepe");

        Cantante cantante_uno;
        cantante_uno=new Cantante("7255422556","Juan","10-ene-1948");

        persona_uno.Saludo();
        deportista_uno.Saludo();
        cantante_uno.Saludo();
        periodista_uno.Saludo();
        System.out.println("\n"+persona_uno.impuesto(861));
        System.out.println(deportista_uno.impuesto(324.1));
        System.out.println(periodista_uno.impuesto(7485.12));
        System.out.println(cantante_uno.impuesto(145895));
    }
}