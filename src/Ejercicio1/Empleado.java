package Ejercicio1;

	public class Empleado {

		// Atributos 
	    private static int contador = 1000; 
	    private final int id;
	    private String nombre;
	    private int edad;
	    
	    // Constructor
	    public Empleado() {
	        this.id = contador++;
	    }
	    
	 
	}
