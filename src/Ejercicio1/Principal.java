package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		System.out.println("- - EMPLEADOS: - - - - - - - - - - - - - - -");
		
		// EJEMPLO CON CONSTRUCTOR 1 (VACIO)
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Juan");
		empleado1.setEdad(25);
		System.out.println(empleado1.toString());
		
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Pedro");
		empleado2.setEdad(32);
		System.out.println(empleado2.toString());
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Manuel");
		empleado3.setEdad(41);
		System.out.println(empleado3.toString());		
		
		// EJEMPLO CON CONSTRUCTOR 2 (PARAMETROS)
		Empleado empleado4 = new Empleado("Emiliano", 29);
		System.out.println(empleado4.toString());
		
		Empleado empleado5 = new Empleado("Raul", 33);
		System.out.println(empleado5.toString());
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("PROXIMO ID: " + Empleado.devuelveProximoID());
		
		
		
	}

}
