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
	        this.nombre = "sin nombre";
	        this.edad = 99;
	    }
	    
	    public Empleado(String nombre, int edad) {
	        this.id = contadorID++;
	        this.nombre = nombre;
	        this.edad = edad;
	    }

		public static int getContador() {
			return contador;
		}

		public static void setContador(int contador) {
			Empleado.contador = contador;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getId() {
			return id;
		}
	    
	    
	    
	    
	    
	 
	}
